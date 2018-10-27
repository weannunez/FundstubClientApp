package com.bbdev.app.fundstubclientapp.ui.splash.view

import com.bbdev.app.fundstubclientapp.data.dataclass.models.Users
import com.bbdev.app.fundstubclientapp.ui.base.view.MVPView

/**
 * Created by wn 04/01000.
 */
interface SplashMVPView : MVPView {

    fun showErrorToast(err: String)
    fun showUserInfo(user: Users)
    fun showError(err: String)
    fun openHomeActivity()
    fun openLoginActivity()
}