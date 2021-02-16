package com.oddlyspaced.taskez

import android.os.Bundle

class SplashActivity : TaskEzActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }
}