package com.bbdev.app.fundstubclientapp.ui.main.interactor

import com.bbdev.app.fundstubclientapp.data.network.LogoutResponse
import com.bbdev.app.fundstubclientapp.ui.base.interactor.MVPInteractor
import io.reactivex.Observable
import io.reactivex.Single

/**
 * Created by wn 08/01000.
 */
interface MainMVPInteractor : MVPInteractor {

    fun getQuestionCardData()
    fun getUserDetails() : Pair<String?,String?>
    fun makeLogoutApiCall() : Observable<LogoutResponse>
}