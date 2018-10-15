package com.bbdev.app.fundstubclientapp.ui.splash.interactor

import com.bbdev.app.fundstubclientapp.ui.base.interactor.MVPInteractor
import io.reactivex.Observable

/**
 * Created by wn 04/01000.
 */
interface SplashMVPInteractor : MVPInteractor {

    fun seedQuestions(): Observable<Boolean>
    fun seedOptions(): Observable<Boolean>
    fun getQuestion()
}