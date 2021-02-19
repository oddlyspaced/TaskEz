package com.oddlyspaced.taskez.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.oddlyspaced.taskez.R
import com.oddlyspaced.taskez.databinding.ActivityOnboardingBinding
import com.oddlyspaced.taskez.fragment.OnboardingFragment1

class OnboardingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOnboardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_onboarding)

        supportFragmentManager.beginTransaction().apply {
            add(binding.frameOnboardingFragmentHolder.id, OnboardingFragment1.newInstance(), OnboardingFragment1::class.simpleName)
            addToBackStack(OnboardingFragment1::class.simpleName)
        }.commit()

    }
}