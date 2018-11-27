package noah.kim.base

import android.support.annotation.DimenRes
import android.util.TypedValue


object ScaleUtils {

    fun dp2px(dp: Float): Int {
        val displayMetrics = appContext.resources.displayMetrics
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, displayMetrics).toInt()
    }

    fun dimen2px(@DimenRes dimension: Int): Int {
        return appContext.resources.getDimensionPixelSize(dimension)
    }
}