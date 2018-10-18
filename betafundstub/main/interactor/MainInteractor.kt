package com.bbdev.app.fundstubclientapp.ui.main.interactor


import android.widget.MultiAutoCompleteTextView
import com.androidhuman.rxfirebase2.auth.rxCreateUserWithEmailAndPassword
import com.androidhuman.rxfirebase2.auth.rxGetCurrentUser
import com.androidhuman.rxfirebase2.auth.rxSendEmailVerification
import com.androidhuman.rxfirebase2.auth.rxUpdateCurrentUser
import com.bbdev.app.fundstubclientapp.data.network.LogoutResponse
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.internal.operators.observable.ObservableSerialized
import io.reactivex.schedulers.Schedulers

/**
 * Created by wn 08/01000.
 */
class MainInteractor: MainMVPInteractor {



    override fun getQuestionCardData() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getUserDetails(): Pair<String?, String?> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isUserLoggedIn(msg: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun handleLoggedInUser() {
    }

    private fun handleNullUser() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }

    override fun makeLogoutApiCall(): Observable<LogoutResponse> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun performUserLogout() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}


