package com.bbdev.app.fundstubclientapp.data.preferences

import com.bbdev.app.fundstubclientapp.util.AppConstants

/**
 * Created by wn 04/01000.
 */
interface PreferenceHelper {

    fun getCurrentUserLoggedInMode(): Int

    fun setCurrentUserLoggedInMode(mode: AppConstants.LoggedInMode)

    fun getCurrentUserId(): Long?

    fun setCurrentUserId(userId: Long?)

    fun getCurrentUserName(): String

    fun getCurrentUserEmail(): String?

    fun setCurrentUserEmail(email: String?)

    fun getAccessToken(): String?

    fun setAccessToken(accessToken: String?)

}