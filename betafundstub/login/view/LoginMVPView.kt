package com.bbdev.app.fundstubclientapp.ui.login.view

import com.bbdev.app.fundstubclientapp.ui.base.view.MVPView

/**
 * Created by wn 10/01000.
 */
interface LoginMVPView : MVPView {

    fun showValidationMessage(errorCode: Int)
    fun openMainActivity()
}