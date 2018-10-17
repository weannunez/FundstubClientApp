package com.bbdev.app.fundstubclientapp.ui.splash.presenter

import com.bbdev.app.fundstubclientapp.ui.base.presenter.MVPPresenter
import com.bbdev.app.fundstubclientapp.ui.splash.authmanager.AuthManager
import com.bbdev.app.fundstubclientapp.ui.splash.view.SplashMVPView

/**
 * Created by wn 04/01000.
 */
interface SplashMVPPresenter: MVPPresenter<SplashMVPView, AuthManager>{

    fun isAuthenticated(): Boolean

    fun performLogout()

    fun verifyUserInputs(name: String, email: String, password: String)



}