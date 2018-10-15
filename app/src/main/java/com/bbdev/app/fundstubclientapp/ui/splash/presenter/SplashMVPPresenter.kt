package com.bbdev.app.fundstubclientapp.ui.splash.presenter

import com.bbdev.app.fundstubclientapp.ui.base.presenter.MVPPresenter
import com.bbdev.app.fundstubclientapp.ui.splash.interactor.SplashMVPInteractor
import com.bbdev.app.fundstubclientapp.ui.splash.view.SplashMVPView

/**
 * Created by wn 04/01000.
 */
interface SplashMVPPresenter<V : SplashMVPView, I : SplashMVPInteractor> : MVPPresenter<V,I>