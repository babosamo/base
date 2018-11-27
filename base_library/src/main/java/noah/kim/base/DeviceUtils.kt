package noah.kim.base


object DeviceUtils {

    fun getStatusBarSize(): Int {
        val resourceId = appContext.resources.getIdentifier("status_bar_height", "dimen", "android")
        return if (resourceId > 0) appContext.resources.getDimensionPixelSize(resourceId) else 0
    }
}