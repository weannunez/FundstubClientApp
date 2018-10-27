package com.bbdev.app.fundstubclientapp.ui.splash.authmanager


import com.bbdev.app.fundstubclientapp.App
import com.bbdev.app.fundstubclientapp.data.dataclass.models.Users
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.FirebaseFirestore
import java.lang.ref.WeakReference
import javax.inject.Inject


class AuthManager private constructor(){

    @Inject lateinit var session: Session
    private val callbacks: MutableMap<AccessChangedListener, WeakReference<FirebaseAuth.AuthStateListener>>
    private val fireBaseAuth: FirebaseAuth = FirebaseAuth.getInstance()
    private val firebaseFirestore: FirebaseFirestore = FirebaseFirestore.getInstance()
    private val firebaseDatabase: FirebaseDatabase = FirebaseDatabase.getInstance()

    init {
        callbacks = HashMap<AccessChangedListener, WeakReference<FirebaseAuth.AuthStateListener>>()
        App.instance.component.inject(this)
    }

    fun addAccessChangedListener(accessChangedListener: AccessChangedListener){
        val auth = FirebaseAuth.AuthStateListener {
            val user = session.getCurrentUser()
            accessChangedListener.accessChanged(user != null)
        }
        fireBaseAuth.addAuthStateListener(auth)
        callbacks.put(accessChangedListener, WeakReference(auth))
    }

    fun removeAccessChangedListener(accessChangedListener: AccessChangedListener){
        val listener = callbacks[accessChangedListener]?.get()
        if(listener != null){
            fireBaseAuth.removeAuthStateListener(listener)
            callbacks.remove(accessChangedListener)
        }
    }

    fun isCurrentUserAuth(): Users? = session.getCurrentUser()


    fun logout(){
        fireBaseAuth.signOut()
    }

    fun saveUserInputData(user: Users):Task<Void> {
        return firebaseDatabase.getReference("writes/${user.uid}/registrationData/").setValue(user)
    }
    fun performSignIn(email: String, password: String): Task<AuthResult> {
        return fireBaseAuth.signInWithEmailAndPassword(email, password)

    }
    fun performCreateNewUser(email: String, password: String, name: String): Task<AuthResult>{
        return fireBaseAuth.createUserWithEmailAndPassword(email, password)
    }

    interface AccessChangedListener{
        fun accessChanged(hasAccess: Boolean)
    }

    companion object {
        val instance by lazy {   AuthManager() }
    }

}