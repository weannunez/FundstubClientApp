package com.bbdev.app.fundstubclientapp.ui.login

import com.bbdev.app.fundstubclientapp.ui.base.view.MVPView

interface LoginMvpView: MVPView{


    fun showInputError(err: String)

    fun showHomePage()

    fun showAuthErrorResult(err: String)
}