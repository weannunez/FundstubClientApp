package com.bbdev.app.fundstubclientapp.ui.splash.view

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.bbdev.app.fundstubclientapp.R
import com.bbdev.app.fundstubclientapp.ui.base.interactor.MVPInteractor
import com.bbdev.app.fundstubclientapp.ui.base.view.BaseActivity
import com.bbdev.app.fundstubclientapp.ui.base.view.MVPView
import com.bbdev.app.fundstubclientapp.ui.login.view.LoginActivity
import com.bbdev.app.fundstubclientapp.ui.main.presenter.MainPresenter
import com.bbdev.app.fundstubclientapp.ui.main.view.MainActivity
import com.bbdev.app.fundstubclientapp.ui.splash.interactor.SplashMVPInteractor
import com.bbdev.app.fundstubclientapp.ui.splash.presenter.SplashMVPPresenter
import com.bbdev.app.fundstubclientapp.ui.splash.presenter.SplashPresenter
import javax.inject.Inject

class SplashMVPActivity : BaseActivity(), SplashMVPView {

    lateinit var presenter: SplashPresenter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        presenter = SplashPresenter()
        presenter.onAttach(this)


    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onFragmentDetached(tag: String) {

    }

    override fun onFragmentAttached() {
    }

    override fun showSuccessToast() {
        Toast.makeText(this, "yay", Toast.LENGTH_LONG).show()
        presenter.getView()
    }

    override fun showErrorToast() {
    }

    override fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun openLoginActivity() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}
