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

    constructor(ctx: Context) : super(ctx) {
        init(ctx)
    }

    constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr) {
        init(ctx)
//        setAttr(attr)
    }

    constructor(ctx: Context, attr: AttributeSet, defStyleAttr: Int) : super(ctx, attr, defStyleAttr) {
        init(ctx)
//        setAttr(attr)
    }

    private fun init(context: Context) {
        binding = ProgressBarBinding.inflate(LayoutInflater.from(context), this, true)
        binding.guidelineProgressBarPercentage.setGuidelinePercent(0.2F)
    }

//    private fun setAttr(attributes: AttributeSet) {
//        val typedArray = context.obtainStyledAttributes(attributes, R.styleable.TaskEzPrimaryButton, 0, 0)
//        try {
//            binding.imgPrimaryButtonDrawable.isVisible = typedArray.getBoolean(R.styleable.TaskEzPrimaryButton_iconVisible, false)
//            binding.txPrimaryButtonText.text = typedArray.getString(R.styleable.TaskEzPrimaryButton_text)
//            binding.imgPrimaryButtonDrawable.setImageResource(typedArray.getResourceId(R.styleable.TaskEzPrimaryButton_iconSrc, R.drawable.ic_mail))
//            if (typedArray.getBoolean(R.styleable.TaskEzPrimaryButton_deactivated, false)) {
//                this.setCardBackgroundColor(context.getColor(R.color.background_2))
//                binding.txPrimaryButtonText.setTextColor(context.getColor(R.color.state_deactivated))
//                this.elevation = DimensionUtils.floatToDp(context, 0F)
//            }
//        }
//        catch (e: Exception) {
//            e.printStackTrace()
//        }
//        finally {
//            typedArray.recycle()
//        }
//    }

}