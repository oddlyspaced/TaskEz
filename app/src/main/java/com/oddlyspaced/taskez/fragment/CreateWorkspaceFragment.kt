package com.oddlyspaced.taskez.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.oddlyspaced.taskez.R
import com.oddlyspaced.taskez.adapter.ColorThemeAdapter
import com.oddlyspaced.taskez.databinding.FragmentCreateWorkspaceBinding
import com.oddlyspaced.taskez.modal.ColorThemeItem

class CreateWorkspaceFragment: Fragment() {

    companion object {
        @JvmStatic
        fun newInstance(): CreateWorkspaceFragment {
            return CreateWorkspaceFragment()
        }
    }

    private lateinit var binding: FragmentCreateWorkspaceBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_create_workspace, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCreateWorkspaceBinding.bind(view)

        val list = arrayListOf(
            ColorThemeItem(R.drawable.gradient_2),
            ColorThemeItem(R.drawable.gradient_3),
            ColorThemeItem(R.drawable.gradient_7),
            ColorThemeItem(R.drawable.gradient_8),
            ColorThemeItem(R.drawable.gradient_9),
            ColorThemeItem(R.color.colorful_1),
            ColorThemeItem(R.color.colorful_2),
            ColorThemeItem(R.color.colorful_3),
            ColorThemeItem(R.color.colorful_4),
            ColorThemeItem(R.color.colorful_5),
            )

        val adapter = ColorThemeAdapter(list)
        binding.rvWorkspaceColorTheme.layoutManager = GridLayoutManager(context, 5)
        binding.rvWorkspaceColorTheme.setHasFixedSize(true)
        binding.rvWorkspaceColorTheme.adapter = adapter
        binding.rvWorkspaceColorTheme.isNestedScrollingEnabled = false
    }
}