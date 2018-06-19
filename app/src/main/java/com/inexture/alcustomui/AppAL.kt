package com.inexture.alcustomui

import android.app.Application
import com.applozic.mobicomkit.Applozic

/**
 * Created by TAPANHP on 6/19/2018.
 */

class AppAL : Application() {

    override fun onCreate() {
        super.onCreate()
        //NOTE: Here need to change Application key if change in AndroidManifest
        Applozic.init(this, "d49c0963288af20aba61ec7399e01d55")
    }
}