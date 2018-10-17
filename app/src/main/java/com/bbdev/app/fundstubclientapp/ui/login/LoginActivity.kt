package com.bbdev.app.fundstubclientapp.ui.login

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bbdev.app.fundstubclientapp.App
import com.bbdev.app.fundstubclientapp.R
import com.bbdev.app.fundstubclientapp.ui.base.view.BaseActivity
import com.bbdev.app.fundstubclientapp.ui.home.HomeActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity(), LoginMvpView {

    private lateinit var presenter: LoginMvpPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        App.instance.component.inject(this)
        hideProgress()
        setContentView(R.layout.activity_login)
        presenter = LoginPresenter()
        presenter.onAttach(this)
        setClickisteners()
    }


    fun setClickisteners(){
        sign_in_btn.setOnClickListener {
            this.showProgress()
            presenter.verifyUserInputs(input_email.text.toString(), input_email2.text.toString()) }
    }

    override fun showInputError(err: String) {
        showEmailError(err)
        showPasswordError(err)
    }

    fun showPasswordError(err: String){
        input_email2.error = err
    }
    fun showEmailError(err: String){
        input_email.error = err
    }

    override fun showAuthErrorResult(err: String) {
        Toast.makeText(this, err, Toast.LENGTH_LONG).show()
    }

    override fun showHomePage() {
        startActivity(Intent(this, HomeActivity::class.java))
        finish()
    }
}
