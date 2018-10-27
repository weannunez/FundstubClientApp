package com.bbdev.app.fundstubclientapp.ui.splash.presenter

import android.text.TextUtils
import com.bbdev.app.fundstubclientapp.App
import com.bbdev.app.fundstubclientapp.data.dataclass.models.Users
import com.bbdev.app.fundstubclientapp.ui.splash.authmanager.AuthManager
import com.bbdev.app.fundstubclientapp.ui.splash.view.SplashMVPView
import javax.inject.Inject


/**
 * Created by wn 04/01000.
 */
class SplashPresenter: SplashMVPPresenter {


    @Inject
    lateinit var authManager: AuthManager

    private lateinit var view: SplashMVPView

    init {
        App.instance.component.inject(this)
    }

    override fun onAttach(view: SplashMVPView) {
        this.view = view
    }

    override fun isAuthenticated(): Boolean {
        return authManager.isCurrentUserAuth() != null
    }

    override fun verifyUserInputs(name: String,email: String, password: String) {
        if(TextUtils.isEmpty(name)){
            view.hideProgress()
            view.showError("Name cannot be empty")
        }
        if(TextUtils.isDigitsOnly(email)){
            view.showError("Email is invalid")
        }
        if (TextUtils.isEmpty(email)) {
            view.hideProgress()
            view.showError("Email cannot be empty")
        }
        if (TextUtils.isEmpty(password)) {
            view.hideProgress()
            view.showError("Password cannot be empty")
        } else {
            view.hideProgress()
            performCreateNewUser(email, password, name)

        }

    }

    private fun saveUser(user: Users) {
        authManager.saveUserInputData(user).addOnCompleteListener {
            if (it.isSuccessful){
                view.openHomeActivity()
            }else{
                view.hideProgress()
                view.showError(it.exception.toString())
            }
        }
    }

    private fun performCreateNewUser(email: String, password: String, name: String) {
       view.showProgress()
       authManager.performCreateNewUser(email, password, name).addOnCompleteListener {
            if (it.isSuccessful){
              val uid = it.result!!.user.uid
                val user = Users("", "", "")
                saveUser(user)
            }else{
                view.showError(it.exception.toString())
            }
        }
    }


    override fun onDetach() {
        unSubscribe()
    }

    override fun subscribe() {
        if (!isAuthenticated()) {
            authManager.removeAccessChangedListener(mAuthStateListener)
        } else {
            authManager.addAccessChangedListener(mAuthStateListener)
        }
    }

    override fun unSubscribe() {
        authManager.removeAccessChangedListener(mAuthStateListener)
    }

    override fun performLogout() {
        authManager.logout()
    }

    private val mAuthStateListener = object : AuthManager.AccessChangedListener{
        override fun accessChanged(hasAccess: Boolean) {
            if(!hasAccess){
                view.openLoginActivity()
            }
        }
    }
}