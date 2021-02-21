package com.oddlyspaced.taskez.activity

import android.os.Bundle
import com.oddlyspaced.taskez.base.TaskEzActivity
import com.oddlyspaced.taskez.databinding.ActivityAccountBinding
import com.oddlyspaced.taskez.fragment.AskEmailFragment

class AccountActivity : TaskEzActivity() {

    private lateinit var binding: ActivityAccountBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().apply {
            add(binding.frameActivityFragmentHolder.id, AskEmailFragment.newInstance(), AskEmailFragment::class.simpleName)
            addToBackStack(AskEmailFragment::class.simpleName)
        }.commit()
    }
}