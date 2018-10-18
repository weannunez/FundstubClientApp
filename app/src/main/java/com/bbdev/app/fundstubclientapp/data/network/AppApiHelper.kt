package com.bbdev.app.fundstubclientapp.data.network

import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.rx2androidnetworking.Rx2AndroidNetworking
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by wn 04/01000.
 */
class AppApiHelper: ApiHelper {

    override fun performFirebaseSignIn(request: LoginRequest.ServerLoginRequest): Task<AuthResult>{
        return FirebaseAuth.getInstance().signInWithEmailAndPassword(request.email, request.password)
    }


    override fun performFirebaseAuthCreateNewUser(request: LoginRequest.ServerLoginRequest): Task<AuthResult> {
        return FirebaseAuth.getInstance().createUserWithEmailAndPassword(request.email, request.password)
    }
/*

    override fun performFBLogin(request: LoginRequest.FacebookLoginRequest): Observable<LoginResponse> =
            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_FACEBOOK_LOGIN)
                    .addHeaders(apiHeader.publicApiHeader)
                    .addBodyParameter(request)
                    .build()
                    .getObjectObservable(LoginResponse::class.java)

    override fun performGoogleLogin(request: LoginRequest.GoogleLoginRequest): Observable<LoginResponse> =
            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_GOOGLE_LOGIN)
                    .addHeaders(apiHeader.publicApiHeader)
                    .addBodyParameter(request)
                    .build()
                    .getObjectObservable(LoginResponse::class.java)

    override fun performLogoutApiCall(): Observable<LogoutResponse> =
            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_LOGOUT)
                    .addHeaders(apiHeader.protectedApiHeader)
                    .build()
                    .getObjectObservable(LogoutResponse::class.java)




*/

    override fun performLogoutCall(): Unit =
            FirebaseAuth.getInstance().signOut()
}