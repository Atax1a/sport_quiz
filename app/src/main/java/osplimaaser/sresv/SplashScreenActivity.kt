package osplimaaser.sresv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import osplimaaser.sresv.R
import osplimaaser.sresv.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.appLogo.alpha = 0f

        binding.appLogo.animate().setDuration(500).alpha(1f).withEndAction{
            val i = Intent(this,MainActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }


    }
}