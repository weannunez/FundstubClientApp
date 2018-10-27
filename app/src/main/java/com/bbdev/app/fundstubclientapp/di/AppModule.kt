package com.bbdev.app.fundstubclientapp.di

import android.app.Application
import android.content.Context
import com.bbdev.app.fundstubclientapp.data.dataclass.models.Users
import com.bbdev.app.fundstubclientapp.data.dataclass.models.Sports
import com.bbdev.app.fundstubclientapp.ui.home.HomeMvpPresenter
import com.bbdev.app.fundstubclientapp.ui.home.HomePresenter
import com.bbdev.app.fundstubclientapp.ui.splash.authmanager.AuthManager
import com.bbdev.app.fundstubclientapp.ui.splash.authmanager.FirebaseSession
import com.bbdev.app.fundstubclientapp.ui.splash.authmanager.Session
import com.bbdev.app.fundstubclientapp.ui.splash.presenter.SplashMVPPresenter
import com.bbdev.app.fundstubclientapp.ui.splash.presenter.SplashPresenter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private val application: Application) {


    @Provides
    @Singleton
    @ForApplication
    fun providesContext(application: Application): Context {
        return application
    }

    @Provides
    fun providesAuthManager(): AuthManager {
        return AuthManager.instance
    }

    @Provides
    fun provideSplashPresenter(): SplashMVPPresenter {
        return SplashPresenter()
    }

    @Provides
    fun provideHomePresenter(): HomeMvpPresenter {
        return HomePresenter()
    }

    @Provides
    fun provideSportsModel(): Sports? {
        return Sports()

    }

    @Provides
    fun provideUser(): Users? = AuthManager.instance.isCurrentUserAuth()


    @Provides
    fun provideSession(): Session = getSession()

    open fun getSession(): Session {
        return FirebaseSession()
    }

}