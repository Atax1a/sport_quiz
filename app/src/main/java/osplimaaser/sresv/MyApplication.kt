package osplimaaser.sresv

import android.app.Application

import osplimaaser.sresv.Remote.RemoteConfigUtils
import com.onesignal.OneSignal

const val ONESIGNAL_APP_ID = "c17f68cd-9429-43a2-8c97-6c65a0ccb529"

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        RemoteConfigUtils.init()

        // Logging set to help debug issues, remove before releasing your app.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)

        // OneSignal Initialization
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID)
    }
}