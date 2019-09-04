package com.davidodari.simplecounter

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout

class SimpleCounter @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
) :
    LinearLayout(context, attrs, defStyleAttr, defStyleRes) {
    init {
        orientation = HORIZONTAL
        //Inflate layout
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.counter_layout, this)
    }
}
