package com.oddlyspaced.taskez.base

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.isVisible
import androidx.core.view.marginTop
import com.oddlyspaced.taskez.R
import com.oddlyspaced.taskez.databinding.ButtonPrimaryBinding
import com.oddlyspaced.taskez.utils.DimensionUtils

class TaskEzPrimaryButton: CardView {

    private lateinit var binding: ButtonPrimaryBinding

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
        binding = ButtonPrimaryBinding.inflate(LayoutInflater.from(context), this, true)
        this.setCardBackgroundColor(context.getColor(R.color.primary))
        this.elevation = DimensionUtils.floatToDp(context, 8F)
        this.radius = DimensionUtils.floatToDp(context, 24F)
    }

    private fun setAttr(attributes: AttributeSet) {
        val typedArray = context.obtainStyledAttributes(attributes, R.styleable.TaskEzPrimaryButton, 0, 0)
        try {
            binding.imgPrimaryButtonDrawable.isVisible = typedArray.getBoolean(R.styleable.TaskEzPrimaryButton_iconVisible, false)
            binding.txPrimaryButtonText.text = typedArray.getString(R.styleable.TaskEzPrimaryButton_text)
            binding.imgPrimaryButtonDrawable.setImageResource(typedArray.getResourceId(R.styleable.TaskEzPrimaryButton_iconSrc, R.drawable.ic_mail))
            if (typedArray.getBoolean(R.styleable.TaskEzPrimaryButton_deactivated, false)) {
                this.setCardBackgroundColor(context.getColor(R.color.background_2))
                binding.txPrimaryButtonText.setTextColor(context.getColor(R.color.state_deactivated))
                this.elevation = DimensionUtils.floatToDp(context, 0F)
            }
            if (typedArray.getBoolean(R.styleable.TaskEzPrimaryButton_minimised, false)) {
                binding.consPrimaryInternal.setPadding(
                    DimensionUtils.floatToDp(context, 16F).toInt(),
                    DimensionUtils.floatToDp(context, 8F).toInt(),
                    DimensionUtils.floatToDp(context, 16F).toInt(),
                    DimensionUtils.floatToDp(context, 8F).toInt())
            }
        }
        catch (e: Exception) {
            e.printStackTrace()
        }
        finally {
            typedArray.recycle()
        }
    }

}