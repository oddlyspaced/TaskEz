package com.oddlyspaced.taskez.base

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.isVisible
import com.oddlyspaced.taskez.R
import com.oddlyspaced.taskez.databinding.ButtonPrimaryBinding
import com.oddlyspaced.taskez.databinding.ProgressBarBinding
import com.oddlyspaced.taskez.utils.DimensionUtils

class TaskEzProgressBar: ConstraintLayout {

    private lateinit var binding: ProgressBarBinding

    var progress: Float = 0.2F
    set(value) {
        field = value
        if (this::binding.isInitialized) {
            binding.guidelineProgressBarPercentage.setGuidelinePercent(value)
        }
    }

    constructor(ctx: Context) : super(ctx) {
        init(ctx)
    }

    constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr) {
        init(ctx)
        setAttr(attr)
    }

    constructor(ctx: Context, attr: AttributeSet, defStyleAttr: Int) : super(ctx, attr, defStyleAttr) {
        init(ctx)
        setAttr(attr)
    }

    private fun init(context: Context) {
        binding = ProgressBarBinding.inflate(LayoutInflater.from(context), this, true)
    }

    private fun setAttr(attributes: AttributeSet) {
        val typedArray = context.obtainStyledAttributes(attributes, R.styleable.TaskEzProgressBar, 0, 0)
        try {
            binding.guidelineProgressBarPercentage.setGuidelinePercent(typedArray.getFloat(R.styleable.TaskEzProgressBar_progress, 0F))
        }
        catch (e: Exception) {
            e.printStackTrace()
        }
        finally {
            typedArray.recycle()
        }
    }

}