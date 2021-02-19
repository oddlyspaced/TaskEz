package com.oddlyspaced.taskez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.oddlyspaced.taskez.activity.SplashActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        startActivity(Intent(applicationContext, SplashActivity::class.java))
    }
}