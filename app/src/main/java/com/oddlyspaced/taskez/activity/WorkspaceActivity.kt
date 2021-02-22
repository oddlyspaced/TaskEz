package com.oddlyspaced.taskez.activity

import android.os.Bundle
import com.oddlyspaced.taskez.base.TaskEzActivity
import com.oddlyspaced.taskez.databinding.ActivityWorkspaceBinding
import com.oddlyspaced.taskez.fragment.CreateWorkspaceFragment

class WorkspaceActivity : TaskEzActivity() {

    private lateinit var binding: ActivityWorkspaceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWorkspaceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().apply {
            add(binding.frameWorkspaceFragmentHolder.id, CreateWorkspaceFragment.newInstance(), CreateWorkspaceFragment::class.simpleName)
            addToBackStack(CreateWorkspaceFragment::class.simpleName)
        }.commit()
    }
}