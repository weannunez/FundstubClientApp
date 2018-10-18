package com.bbdev.app.fundstubclientapp.ui.login.view


import android.app.SharedElementCallback
import android.os.Bundle
import com.bbdev.app.fundstubclientapp.R
import com.bbdev.app.fundstubclientapp.ui.base.view.BaseActivity


/**
 * Created by wn 10/01000.
 */
class LoginActivity : BaseActivity(), LoginMVPView {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

    }

    override fun showValidationMessage(errorCode: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun openMainActivity() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setEnterSharedElementCallback(callback: SharedElementCallback?) {
    }


}