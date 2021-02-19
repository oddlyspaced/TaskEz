package com.oddlyspaced.taskez.base

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.oddlyspaced.taskez.R

// An extended ConstraintLayout that has it's background set as layout_activity_background by default
class TaskEzLayout: ConstraintLayout {

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
        LayoutInflater.from(context).inflate(R.layout.layout_activity_background, this, true)
    }

}