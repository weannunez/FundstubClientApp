package com.bbdev.app.fundstubclientapp.util


/**
 * Created by wn 05/01000.
 */
object AppConstants {

    internal val APP_DB_NAME = "firebase.db"
    internal val PREF_NAME = "fundstub_prefs"
    internal val EMPTY_EMAIL_ERROR = 1001
    internal val INVALID_EMAIL_ERROR = 1002
    internal val EMPTY_PASSWORD_ERROR = 1003
    internal val LOGIN_FAILURE = 1004
    internal val NULL_INDEX = -1L

    enum class LoggedInMode constructor(val type: Int) {
        LOGGED_IN_MODE_LOGGED_OUT(0),
        LOGGED_IN_MODE_GOOGLE(1),
        LOGGED_IN_MODE_FB(2),
        LOGGED_IN_MODE_SERVER(3)
    }
}