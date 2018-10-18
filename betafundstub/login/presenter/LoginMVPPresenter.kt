package com.bbdev.app.fundstubclientapp.ui.login.presenter

import com.bbdev.app.fundstubclientapp.ui.base.presenter.MVPPresenter
import com.bbdev.app.fundstubclientapp.ui.login.interactor.LoginMVPInteractor
import com.bbdev.app.fundstubclientapp.ui.login.view.LoginMVPView

/**
 * Created by wn 10/01000.
 */
interface LoginMVPPresenter<V : LoginMVPView, I : LoginMVPInteractor> : MVPPresenter<V, I> {

    fun onServerLoginClicked(email: String, password: String)
    fun onFBLoginClicked()
    fun onGoogleLoginClicked()

}