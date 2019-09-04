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

    //Will handle listener events and takes in the current value
    private var valueListenr: ((Long) -> Unit)? = null

    //Property accessor on increments or decrements the edit text value will be updated
    var currentValue: Long = 0L
        set(value) {
            field = value
            count_view_edit_text.setText(field.toString())
        }

    init {
        orientation = HORIZONTAL
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.counter_layout, this)
        count_view_edit_text.setText(currentValue.toString())
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
            count_view_edit_text.setText(currentValue.toString())
        } else {
            currentValue = getEditTextValue()
            --currentValue
        }
        retrieveValue()
    }

    private fun incrementValue() {
        currentValue = getEditTextValue()
        ++currentValue
        retrieveValue()
    }

    private fun getEditTextValue(): Long {
        val counterCurrentValue = count_view_edit_text.text
        return counterCurrentValue.toString().toLong()
    }

    //CHecks if value listener has been set and passes the value to the function for any further operations
    private fun retrieveValue() {
        this.valueListenr?.let { function ->
            function(currentValue)
        }
    }
    //Defines higher order function for setting value listener
    fun setListener(value: (Long) -> Unit) {
        this.valueListenr = value
    }
}
