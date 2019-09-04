package com.davidodari.simplecounter

import android.content.Context
import android.util.AttributeSet
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
    }
}
