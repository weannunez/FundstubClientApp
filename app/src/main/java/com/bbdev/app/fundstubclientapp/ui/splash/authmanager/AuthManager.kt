package com.bbdev.app.fundstubclientapp.ui.splash.authmanager

import android.content.Context
import com.bbdev.app.fundstubclientapp.ui.splash.interactor.SplashMVPInteractor
import com.bbdev.app.fundstubclientapp.ui.splash.presenter.SplashMVPPresenter
import com.bbdev.app.fundstubclientapp.ui.splash.view.SplashMVPActivity
import com.bbdev.app.fundstubclientapp.ui.splash.view.SplashMVPView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class AuthManager : AuthManagerMvp.Manager{

    private var view: SplashMVPView = SplashMVPActivity()
    private var auth = FirebaseAuth.getInstance()
    private var user: FirebaseUser = auth.currentUser!!


    private fun authManager(auth: FirebaseAuth, user: FirebaseUser){
        var auth = FirebaseAuth.getInstance()
        this.user = user

        if(user == null){
            handleNullUser()

        }else{

            handleAuthUser()
        }

    }

    private fun handleAuthUser() {
        view.openMainActivity()
    }

    private fun handleNullUser() {
        view.openLoginActivity()
    }

    override fun initializeBackendServices(view: SplashMVPView, presenter: SplashMVPPresenter<SplashMVPView, SplashMVPInteractor>) {
       authManager(auth, user)
    }

    override fun onAttach(context: Context) {
        view.showSuccessToast()
    }

    override fun initializeDatabase() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCurrentUserId() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun authenticateCurrentUser() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updateUserSettings() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}