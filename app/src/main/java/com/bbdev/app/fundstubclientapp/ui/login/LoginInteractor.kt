package com.bbdev.app.fundstubclientapp.ui.login

import com.bbdev.app.fundstubclientapp.data.network.ApiHelper
import com.bbdev.app.fundstubclientapp.data.network.AppApiHelper
import com.bbdev.app.fundstubclientapp.data.network.LoginRequest
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult

class LoginInteractor : LoginMvpInteractor, ApiHelper {

    private var helper : ApiHelper = AppApiHelper()

    override fun performFirebaseSignIn(request: LoginRequest.ServerLoginRequest): Task<AuthResult> {
     return helper.performFirebaseSignIn(request)
    }

    override fun performFirebaseAuthCreateNewUser(request: LoginRequest.ServerLoginRequest): Task<AuthResult> {
    return helper.performFirebaseAuthCreateNewUser(request)
    }


    override fun isUserLoggedIn(msg: String) {

    }

    override fun performUserLogout() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun performLogoutCall() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}