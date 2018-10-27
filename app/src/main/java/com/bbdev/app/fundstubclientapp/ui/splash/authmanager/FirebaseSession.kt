package com.bbdev.app.fundstubclientapp.ui.splash.authmanager

import com.bbdev.app.fundstubclientapp.data.dataclass.models.Users
import com.google.firebase.auth.FirebaseAuth

class FirebaseSession: Session{

    override fun getCurrentUser(): Users?{
        var appUser: Users? = null
        val user = FirebaseAuth.getInstance().currentUser
        if (user != null) {
            appUser = Users(
                user.uid,
                user.email.toString(),
                user.displayName.toString()
            )
        }
        return appUser

    }
}