package com.bbdev.app.fundstubclientapp.ui.base.interactor

import com.bbdev.app.fundstubclientapp.data.network.ApiHelper
import com.bbdev.app.fundstubclientapp.ui.base.preferences.PreferenceHelper
import com.bbdev.app.fundstubclientapp.util.AppConstants

/**
 * Created by wn 04/01000.
 */
open class BaseInteractor() : MVPInteractor {


    protected lateinit var preferenceHelper: PreferenceHelper
    protected lateinit var apiHelper: ApiHelper

    constructor(preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) : this() {
        this.preferenceHelper = preferenceHelper
        this.apiHelper = apiHelper
    }


    override fun performUserLogout() = preferenceHelper.let {
        it.setCurrentUserId(null)
        it.setAccessToken(null)
        it.setCurrentUserEmail(null)
        it.setCurrentUserLoggedInMode(AppConstants.LoggedInMode.LOGGED_IN_MODE_LOGGED_OUT)
    }
    override fun isUserLoggedIn(msg: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}