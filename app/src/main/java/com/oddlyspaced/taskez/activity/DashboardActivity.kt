package com.oddlyspaced.taskez.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.oddlyspaced.taskez.R
import com.oddlyspaced.taskez.base.TaskEzActivity

class DashboardActivity : TaskEzActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
    }
}