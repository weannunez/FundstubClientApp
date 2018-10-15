package com.bbdev.app.fundstubclientapp.ui.main.presenter

import com.bbdev.app.fundstubclientapp.ui.base.presenter.MVPPresenter
import com.bbdev.app.fundstubclientapp.ui.main.interactor.MainMVPInteractor
import com.bbdev.app.fundstubclientapp.ui.main.view.MainMVPView

/**
 * Created by wn 08/01000.
 */
interface MainMVPPresenter<V : MainMVPView, I : MainMVPInteractor> : MVPPresenter<V, I> {

    fun refreshQuestionCards(): Boolean?
    fun onDrawerOptionAboutClick() : Unit?
    fun onDrawerOptionRateUsClick(): Unit?
    fun onDrawerOptionFeedClick(): Unit?
    fun onDrawerOptionLogoutClick()

}