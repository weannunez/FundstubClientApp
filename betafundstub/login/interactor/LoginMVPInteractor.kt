package com.bbdev.app.fundstubclientapp.ui.login.interactor

import com.bbdev.app.fundstubclientapp.data.network.LoginResponse
import com.bbdev.app.fundstubclientapp.ui.base.interactor.MVPInteractor
import com.bbdev.app.fundstubclientapp.util.AppConstants
import io.reactivex.Observable

/**
 * Created by wn 10/01000.
 */
interface LoginMVPInteractor : MVPInteractor {

    fun doServerLoginApiCall(email: String, password: String): Observable<LoginResponse>

    fun doFBLoginApiCall(): Observable<LoginResponse>

    fun doGoogleLoginApiCall(): Observable<LoginResponse>

    fun updateUserInSharedPref(loginResponse: LoginResponse, loggedInMode: AppConstants.LoggedInMode)

}