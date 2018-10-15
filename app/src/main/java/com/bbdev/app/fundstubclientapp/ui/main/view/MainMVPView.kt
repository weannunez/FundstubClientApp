package com.bbdev.app.fundstubclientapp.ui.main.view

import com.bbdev.app.fundstubclientapp.ui.base.view.MVPView

/**
 * Created by wn 08/01000.
 */
interface MainMVPView : MVPView {

    fun inflateUserDetails(userDetails: Pair<String?, String?>)
    fun openLoginActivity()
    fun openFeedActivity()
    fun openAboutFragment()
    fun openRateUsDialog(): Unit?
    fun lockDrawer(): Unit?
    fun unlockDrawer(): Unit?
}