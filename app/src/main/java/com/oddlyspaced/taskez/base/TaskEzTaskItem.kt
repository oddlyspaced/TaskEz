package com.oddlyspaced.taskez.base

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.cardview.widget.CardView
import com.oddlyspaced.taskez.R
import com.oddlyspaced.taskez.databinding.LayoutTaskItemBinding
import com.oddlyspaced.taskez.utils.DimensionUtils

class TaskEzTaskItem: CardView {

    private lateinit var binding: LayoutTaskItemBinding

    constructor(ctx: Context): super(ctx) {
        init(ctx)
    }

    constructor(ctx: Context, attr: AttributeSet): super(ctx, attr) {
        init(ctx)
    }

    constructor(ctx: Context, attr: AttributeSet, defStyleAttr: Int): super(ctx, attr, defStyleAttr) {
        init(ctx)
    }

    private fun init(context: Context) {
        binding = LayoutTaskItemBinding.inflate(LayoutInflater.from(context), this, true)
        this.apply {
            setCardBackgroundColor(context.getColor(R.color.background_2))
            elevation = DimensionUtils.floatToDp(context, 0F)
            radius = DimensionUtils.floatToDp(context, 16F)
        }
    }


}