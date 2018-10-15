package com.bbdev.app.fundstubclientapp.ui.splash.presenter

import com.bbdev.app.fundstubclientapp.ui.splash.interactor.SplashInteractor
import com.bbdev.app.fundstubclientapp.ui.splash.interactor.SplashMVPInteractor
import com.bbdev.app.fundstubclientapp.ui.splash.view.SplashMVPActivity
import com.bbdev.app.fundstubclientapp.ui.splash.view.SplashMVPView


/**
 * Created by wn 04/01000.
 */
class SplashPresenter: SplashMVPPresenter<SplashMVPView, SplashMVPInteractor>{

    private var view: SplashMVPView = SplashMVPActivity()
    private var interactor: SplashMVPInteractor = SplashInteractor()



    override fun onAttach(view: SplashMVPView?) {
        view?.showSuccessToast()
    }

    override fun onDetach() {
        view.openLoginActivity()
    }

    override fun getView(): SplashMVPView?{
        return null
    }


    private fun onMorings (){

        view.openMainActivity()
    }
}