package com.bbdev.app.fundstubclientapp.ui.login

import android.text.TextUtils
import com.bbdev.app.fundstubclientapp.App
import com.bbdev.app.fundstubclientapp.data.dataclass.User
import com.bbdev.app.fundstubclientapp.ui.splash.authmanager.AuthManager
import org.w3c.dom.Text
import javax.inject.Inject


class LoginPresenter: LoginMvpPresenter{

    private lateinit var view: LoginMvpView

    @Inject lateinit var authManager: AuthManager

    init {
        App.instance.component.inject(this)
    }

    override fun onDetach() {

    }
    override fun onAttach(view: LoginMvpView) {
        view.hideProgress()
        this.view = view
    }

    override fun subscribe() {

    }

    override fun unSubscribe() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    fun performSignIn(email: String, password: String){
        authManager.performSignIn(email, password).addOnCompleteListener {
            if (it.isSuccessful){
                view.hideProgress()
                subscribe()
                view.showHomePage()
            }else{
                view.hideProgress()
                view.showAuthErrorResult(it.exception.toString())
            }
        }
    }



    override fun verifyUserInputs(email: String, password: String) {

        if (TextUtils.isEmpty(email)){
            view.hideProgress()
            view.showInputError("Email cannot be empty")
        }
        if (TextUtils.isEmpty(password)){
            view.hideProgress()
            view.showInputError("Password cannot be empty")
        }
        else{
            performSignIn(email, password)

        }

    }




}