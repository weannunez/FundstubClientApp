package com.bbdev.app.fundstubclientapp.data.network

import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import io.reactivex.Observable

/**
 * Created by wn 04/01000.
 */
interface ApiHelper {

    fun performFirebaseSignIn(request: LoginRequest.ServerLoginRequest): Task<AuthResult>

    fun performFirebaseAuthCreateNewUser(request: LoginRequest.ServerLoginRequest): Task<AuthResult>

    fun performLogoutCall(): Unit
   /*fun performFBLogin(request: LoginRequest.FacebookLoginRequest): Observable<LoginResponse>

    fun performGoogleLogin(request: LoginRequest.GoogleLoginRequest): Observable<LoginResponse>

    fun performLogoutApiCall(): Observable<LogoutResponse>*/



}