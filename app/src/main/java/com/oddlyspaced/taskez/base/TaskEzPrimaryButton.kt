package com.oddlyspaced.taskez.base

import android.content.Context
import android.util.AttributeSet
import android.util.TypedValue
import android.view.LayoutInflater
import androidx.cardview.widget.CardView
import androidx.core.view.isVisible
import com.oddlyspaced.taskez.R
import com.oddlyspaced.taskez.databinding.ButtonPrimaryBinding

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
        LayoutInflater.from(context).inflate(R.layout.button_primary, this, true)
        binding = ButtonPrimaryBinding.bind(this)
        // TODO : Check why double setting is necessary
        binding.cvPrimaryButton.setCardBackgroundColor(context.getColor(R.color.primary))
        binding.cvPrimaryButton.elevation = floatToDp(8F)
        binding.cvPrimaryButton.radius = floatToDp(24F)
    }

    private fun setAttr(attributes: AttributeSet) {
        val typedArray = context.obtainStyledAttributes(attributes, R.styleable.TaskEzPrimaryButton, 0, 0)
        try {
            binding.imgPrimaryButtonDrawable.isVisible = typedArray.getBoolean(R.styleable.TaskEzPrimaryButton_iconVisible, false)
            binding.txPrimaryButtonText.text = typedArray.getString(R.styleable.TaskEzPrimaryButton_text)
            binding.imgPrimaryButtonDrawable.setImageResource(typedArray.getResourceId(R.styleable.TaskEzPrimaryButton_iconSrc, R.drawable.ic_mail))
        }
        catch (e: Exception) {
            e.printStackTrace()
        }
        finally {
            typedArray.recycle()
        }
    }

    private fun floatToDp(dp: Float) = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.resources.displayMetrics)

}