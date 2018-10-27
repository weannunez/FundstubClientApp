package com.bbdev.app.fundstubclientapp.ui.splash.authmanager

import com.bbdev.app.fundstubclientapp.data.dataclass.models.Users

interface Session{

    fun getCurrentUser(): Users?
}