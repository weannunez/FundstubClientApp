package com.bbdev.app.fundstubclientapp.di

import com.bbdev.app.fundstubclientapp.App
import com.bbdev.app.fundstubclientapp.ui.base.view.BaseActivity
import com.bbdev.app.fundstubclientapp.ui.home.HomeActivity
import com.bbdev.app.fundstubclientapp.ui.login.LoginActivity
import com.bbdev.app.fundstubclientapp.ui.login.LoginPresenter
import com.bbdev.app.fundstubclientapp.ui.splash.authmanager.AuthManager
import com.bbdev.app.fundstubclientapp.ui.splash.presenter.SplashPresenter
import com.bbdev.app.fundstubclientapp.ui.splash.view.SplashMVPActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(AppModule::class)])
interface AppComponent{

    fun inject(activity: BaseActivity)

    fun inject(activity: SplashMVPActivity)

    fun inject(activity: LoginActivity)

    fun inject(activity: HomeActivity)

    fun inject(presenter: LoginPresenter)

    fun inject(presenter: SplashPresenter)

    fun inject(authManager: AuthManager)

}