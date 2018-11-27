package noah.kim.base


object StringUtils {

    fun getResString(resId: Int): String {
        return appContext.getString(resId)
    }
}