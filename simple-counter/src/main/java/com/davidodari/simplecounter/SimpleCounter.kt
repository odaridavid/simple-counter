package com.davidodari.simplecounter

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.counter_layout.view.*

class SimpleCounter @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
) :
    LinearLayout(context, attrs, defStyleAttr, defStyleRes) {
    init {
        orientation = HORIZONTAL
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.counter_layout, this)
        //Initialise default value
        count_view_edit_text.setText("0")
        // Set on-click listeners to buttons
        increment_image_button.setOnClickListener {
            incrementValue()
        }
        decrement_image_button.setOnClickListener {
            decrementValue()
        }
    }

    private fun decrementValue() {
        val counterCurrentValue = count_view_edit_text.text
        if (counterCurrentValue.toString() == "0") {
            count_view_edit_text.setText("0")
        } else {
            var counterCurrentValueAsLong = getEditTextValue()
            --counterCurrentValueAsLong
            count_view_edit_text.setText(counterCurrentValueAsLong.toString())
        }
    }

    private fun incrementValue() {
        var counterCurrentValueAsLong = getEditTextValue()
        ++counterCurrentValueAsLong
        count_view_edit_text.setText(counterCurrentValueAsLong.toString())
    }

    private fun getEditTextValue(): Long {
        val counterCurrentValue = count_view_edit_text.text
        return counterCurrentValue.toString().toLong()
    }
}
