package com.oddlyspaced.taskez.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.oddlyspaced.taskez.R
import com.oddlyspaced.taskez.databinding.ItemColorThemeBinding
import com.oddlyspaced.taskez.modal.ColorThemeItem
import com.oddlyspaced.taskez.utils.DimensionUtils

class ColorThemeAdapter(private val list: ArrayList<ColorThemeItem>): RecyclerView.Adapter<ColorThemeAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val binding: ItemColorThemeBinding = ItemColorThemeBinding.bind(itemView)
        val card = binding.cvColorTheme
        val gradient = binding.consColorThemeGradient
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_color_theme, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]
        if (item.isSelected) {
            holder.card.strokeWidth = DimensionUtils.floatToDp(holder.itemView.context, 2F).toInt()
        }
        holder.gradient.setBackgroundResource(item.resource)
    }

    override fun getItemCount(): Int = list.size


}