package com.oddlyspaced.taskez.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.oddlyspaced.taskez.R
import com.oddlyspaced.taskez.adapter.TaskStackAdapter
import com.oddlyspaced.taskez.base.TaskEzActivity
import com.oddlyspaced.taskez.databinding.ActivityDashboardBinding
import com.yuyakaido.android.cardstackview.CardStackLayoutManager

class DashboardActivity : TaskEzActivity() {

    private lateinit var binding: ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cardStackDashboard.layoutManager = CardStackLayoutManager(applicationContext)
        binding.cardStackDashboard.adapter = TaskStackAdapter()

    }
}