package com.bbdev.app.fundstubclientapp.ui.splash.authmanager

import android.content.Context
import android.view.View
import com.bbdev.app.fundstubclientapp.ui.splash.interactor.SplashMVPInteractor
import com.bbdev.app.fundstubclientapp.ui.splash.presenter.SplashMVPPresenter
import com.bbdev.app.fundstubclientapp.ui.splash.presenter.SplashPresenter
import com.bbdev.app.fundstubclientapp.ui.splash.view.SplashMVPActivity
import com.bbdev.app.fundstubclientapp.ui.splash.view.SplashMVPView
import com.google.firebase.auth.FirebaseAuth

interface AuthManagerMvp {

    interface Manager{

        fun onAttach(contet: Context)

        fun initializeBackendServices(view: SplashMVPView, presenter: SplashMVPPresenter<SplashMVPView, SplashMVPInteractor>)

        fun initializeDatabase()

        fun getCurrentUserId()

        fun authenticateCurrentUser()

        fun updateUserSettings()
    }
}