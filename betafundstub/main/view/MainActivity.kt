package com.bbdev.app.fundstubclientapp.ui.main.view

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.view.MenuItem
import com.bbdev.app.fundstubclientapp.R
import com.bbdev.app.fundstubclientapp.ui.base.view.BaseActivity


class MainActivity : BaseActivity(), MainMVPView, NavigationView.OnNavigationItemSelectedListener{


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    override fun inflateUserDetails(userDetails: Pair<String?, String?>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }



    override fun openLoginActivity() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun openFeedActivity() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun openAboutFragment() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun openRateUsDialog(): Unit? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun lockDrawer(): Unit? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun unlockDrawer(): Unit? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onNavigationItemSelected(p0: MenuItem): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }



}
