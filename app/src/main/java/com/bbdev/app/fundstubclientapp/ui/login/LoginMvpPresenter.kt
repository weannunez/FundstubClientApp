package com.bbdev.app.fundstubclientapp.ui.login

import com.bbdev.app.fundstubclientapp.ui.base.presenter.MVPPresenter

interface LoginMvpPresenter: MVPPresenter<LoginMvpView,LoginMvpInteractor > {


    fun verifyUserInputs(email: String, password: String)

}