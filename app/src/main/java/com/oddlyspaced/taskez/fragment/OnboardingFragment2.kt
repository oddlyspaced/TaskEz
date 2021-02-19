package com.oddlyspaced.taskez.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.oddlyspaced.taskez.R

class OnboardingFragment2: Fragment() {

    companion object {
        @JvmStatic
        fun newInstance(): OnboardingFragment2 {
            return OnboardingFragment2()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_onboarding_2, container, false)
    }

}