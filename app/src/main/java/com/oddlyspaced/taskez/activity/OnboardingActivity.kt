package com.oddlyspaced.taskez.activity

import android.os.Bundle
import com.oddlyspaced.taskez.R
import com.oddlyspaced.taskez.base.TaskEzActivity
import com.oddlyspaced.taskez.databinding.ActivityOnboardingBinding
import com.oddlyspaced.taskez.fragment.OnboardingFragment1
import com.oddlyspaced.taskez.fragment.OnboardingFragment2

class OnboardingActivity : TaskEzActivity() {

    private lateinit var binding: ActivityOnboardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_onboarding)

        supportFragmentManager.beginTransaction().apply {
            add(binding.frameOnboardingFragmentHolder.id, OnboardingFragment2.newInstance(), OnboardingFragment1::class.simpleName)
            addToBackStack(OnboardingFragment1::class.simpleName)
        }.commit()

    }
}