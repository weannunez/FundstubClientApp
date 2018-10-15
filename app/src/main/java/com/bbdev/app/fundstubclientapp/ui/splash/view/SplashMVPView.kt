package com.bbdev.app.fundstubclientapp.ui.splash.view

import com.bbdev.app.fundstubclientapp.ui.base.view.MVPView

/**
 * Created by wn 04/01000.
 */
interface SplashMVPView : MVPView {

    fun showSuccessToast()
    fun showErrorToast()
    fun openMainActivity()
    fun openLoginActivity()
}