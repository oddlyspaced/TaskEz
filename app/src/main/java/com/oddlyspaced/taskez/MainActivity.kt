package com.oddlyspaced.taskez

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.oddlyspaced.taskez.activity.AccountActivity
import com.oddlyspaced.taskez.activity.WorkspaceActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        startActivity(Intent(applicationContext, WorkspaceActivity::class.java))
    }
}