package com.oddlyspaced.taskez.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.oddlyspaced.taskez.R
import com.oddlyspaced.taskez.databinding.ItemColorThemeBinding
import com.oddlyspaced.taskez.modal.ColorThemeItem
import com.oddlyspaced.taskez.utils.DimensionUtils

class ColorThemeAdapter(private val list: ArrayList<ColorThemeItem>, var selectedIndex: Int = 0): RecyclerView.Adapter<ColorThemeAdapter.ViewHolder>() {

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
        holder.card.strokeWidth = DimensionUtils.floatToDp(holder.itemView.context, if (position == selectedIndex) 2F else 0F).toInt()
        holder.gradient.setBackgroundResource(item.resource)
        holder.card.setOnClickListener {
            val bkp = selectedIndex
            selectedIndex = position
            notifyItemChanged(bkp)
            notifyItemChanged(selectedIndex)
        }
    }

    override fun getItemCount(): Int = list.size

}