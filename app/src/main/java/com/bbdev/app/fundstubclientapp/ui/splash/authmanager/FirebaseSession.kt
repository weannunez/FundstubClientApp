package com.bbdev.app.fundstubclientapp.ui.splash.authmanager

import com.bbdev.app.fundstubclientapp.data.dataclass.User
import com.google.firebase.auth.FirebaseAuth

class FirebaseSession: Session{

    override fun getCurrentUser(): User? {
        var appUser: User? = null
        val user = FirebaseAuth.getInstance().currentUser
        if (user != null) {
            appUser = User(
                user.uid,
                user.email.toString(),
                user.displayName.toString()
            )
        }
        return appUser

    }
}