package com.oddlyspaced.taskez

import android.content.Intent
import android.os.Bundle
import com.oddlyspaced.taskez.activity.DashboardActivity
import com.oddlyspaced.taskez.base.TaskEzActivity

class MainActivity : TaskEzActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        startActivity(Intent(applicationContext, DashboardActivity::class.java))
    }
}