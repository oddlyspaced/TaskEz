package com.oddlyspaced.taskez.activity

import android.os.Bundle
import com.oddlyspaced.taskez.R
import com.oddlyspaced.taskez.base.TaskEzActivity

class SplashActivity : TaskEzActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }
}