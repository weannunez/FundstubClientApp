package com.bbdev.app.fundstubclientapp.ui.base.presenter

import com.bbdev.app.fundstubclientapp.ui.base.interactor.MVPInteractor
import com.bbdev.app.fundstubclientapp.ui.base.view.MVPView

/**
 * Created by wn 04/01000.
 */
interface MVPPresenter<V, I> {

    fun onAttach(view: V)

    fun onDetach()

    fun subscribe()

    fun unSubscribe()


}