package com.oddlyspaced.taskez.base

import android.content.Context
import android.util.AttributeSet
import android.util.TypedValue
import android.view.LayoutInflater
import androidx.cardview.widget.CardView
import com.oddlyspaced.taskez.R

class TaskEzPrimaryButton: CardView {

    constructor(ctx: Context) : super(ctx) {
        init(ctx)
    }

    constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr) {
        init(ctx)
    }

    constructor(ctx: Context, attr: AttributeSet, defStyleAttr: Int) : super(ctx, attr, defStyleAttr) {
        init(ctx)
    }

    private fun init(context: Context) {
        LayoutInflater.from(context).inflate(R.layout.button_primary, this, true)
        this.setCardBackgroundColor(context.getColor(R.color.primary))
        this.elevation = floatToDp(8F)
        this.radius = floatToDp(24F)
    }

    private fun floatToDp(dp: Float) = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.resources.displayMetrics)

}