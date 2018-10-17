package com.bbdev.app.fundstubclientapp

import android.app.Application
import com.bbdev.app.fundstubclientapp.di.AppComponent
import com.bbdev.app.fundstubclientapp.di.AppModule
import com.bbdev.app.fundstubclientapp.di.DaggerAppComponent


class App: Application(){

    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()
        instance = this

        component = DaggerAppComponent.builder().appModule(AppModule(Application())).build()

    }
    companion object {
        lateinit var instance : App private set
    }
}