package com.bbdev.app.fundstubclientapp.ui.splash.authmanager

import com.bbdev.app.fundstubclientapp.data.dataclass.User

interface Session{

    fun getCurrentUser(): User?
}