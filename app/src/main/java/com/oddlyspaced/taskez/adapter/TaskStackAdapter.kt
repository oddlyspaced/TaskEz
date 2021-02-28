package com.oddlyspaced.taskez.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.oddlyspaced.taskez.Global
import com.oddlyspaced.taskez.R
import com.oddlyspaced.taskez.databinding.ItemTaskProgressBinding

class TaskStackAdapter: RecyclerView.Adapter<TaskStackAdapter.TaskStackViewHolder>() {

    class TaskStackViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val binding = ItemTaskProgressBinding.bind(itemView)
        val background = binding.consTaskItem
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskStackViewHolder {
        return TaskStackViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_task_progress, parent, false))
    }

    override fun onBindViewHolder(holder: TaskStackViewHolder, position: Int) {
        holder.background.setBackgroundResource(Global.gradientList.random())
    }

    override fun getItemCount(): Int {
        return 5
    }
}