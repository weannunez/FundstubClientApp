package com.bbdev.app.fundstubclientapp.ui.login.presenter

import com.bbdev.app.fundstubclientapp.data.network.LoginResponse
import com.bbdev.app.fundstubclientapp.ui.base.presenter.BasePresenter
import com.bbdev.app.fundstubclientapp.ui.login.interactor.LoginMVPInteractor
import com.bbdev.app.fundstubclientapp.ui.login.view.LoginMVPView
import com.bbdev.app.fundstubclientapp.util.AppConstants
import com.bbdev.app.fundstubclientapp.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Consumer
import javax.inject.Inject

/**
 * Created by wn 10/01000.
 */
class LoginPresenter<V : LoginMVPView, I : LoginMVPInteractor> @Inject internal constructor(interactor: I, schedulerProvider: SchedulerProvider, disposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider, compositeDisposable = disposable), LoginMVPPresenter<V, I> {

    override fun onServerLoginClicked(email: String, password: String) {
        when {
            email.isEmpty() -> getView()?.showValidationMessage(AppConstants.EMPTY_EMAIL_ERROR)
            password.isEmpty() -> getView()?.showValidationMessage(AppConstants.EMPTY_PASSWORD_ERROR)
            else -> {
                getView()?.showProgress()
                interactor?.let {
                    compositeDisposable.add(it.doServerLoginApiCall(email, password)
                            .compose(schedulerProvider.ioToMainObservableScheduler())
                            .subscribe({ loginResponse ->
                                updateUserInSharedPref(loginResponse = loginResponse,
                                        loggedInMode = AppConstants.LoggedInMode.LOGGED_IN_MODE_SERVER)
                                getView()?.openMainActivity()
                            }, { err -> println(err) }))
                }

            }
        }
    }

    override fun onFBLoginClicked() {
        getView()?.showProgress()
        interactor?.let {
            compositeDisposable.add(it.doFBLoginApiCall()
                    .compose(schedulerProvider.ioToMainObservableScheduler())
                    .subscribe({ loginResponse ->
                        updateUserInSharedPref(loginResponse = loginResponse,
                                loggedInMode = AppConstants.LoggedInMode.LOGGED_IN_MODE_FB)
                        getView()?.let {
                            it.hideProgress()
                            it.openMainActivity()
                        }
                    }, { err -> println(err) }))
        }


    }

    override fun onGoogleLoginClicked() {
        getView()?.showProgress()
        interactor?.let {
            compositeDisposable.add(it.doGoogleLoginApiCall()
                    .compose(schedulerProvider.ioToMainObservableScheduler())
                    .subscribe({ loginResponse ->
                        updateUserInSharedPref(loginResponse = loginResponse,
                                loggedInMode = AppConstants.LoggedInMode.LOGGED_IN_MODE_GOOGLE)
                        getView()?.let {
                            it.hideProgress()
                            it.openMainActivity()
                        }
                    }, { err -> println(err) }))
        }

    }

    private fun updateUserInSharedPref(loginResponse: LoginResponse,
                                       loggedInMode: AppConstants.LoggedInMode) =
            interactor?.updateUserInSharedPref(loginResponse, loggedInMode)


}