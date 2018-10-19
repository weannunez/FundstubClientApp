package com.bbdev.app.fundstubclientapp.ui.splash.view

import android.animation.Animator
import android.animation.ValueAnimator
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.BounceInterpolator
import android.widget.Toast
import com.bbdev.app.fundstubclientapp.App
import com.bbdev.app.fundstubclientapp.R
import com.bbdev.app.fundstubclientapp.data.dataclass.User
import com.bbdev.app.fundstubclientapp.ui.base.view.BaseActivity
import com.bbdev.app.fundstubclientapp.ui.home.HomeActivity
import com.bbdev.app.fundstubclientapp.ui.login.LoginActivity
import com.bbdev.app.fundstubclientapp.ui.splash.presenter.SplashMVPPresenter
import com.bbdev.app.fundstubclientapp.ui.splash.presenter.SplashPresenter
import kotlinx.android.synthetic.main.activity_splash.*

class SplashMVPActivity : BaseActivity(), SplashMVPView {

    private lateinit var presenter: SplashMVPPresenter
    private val ANIMATION_DURATION:Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        App.instance.component.inject(this)
        setContentView(R.layout.activity_splash)
        presenter = SplashPresenter()
        presenter.onAttach(this)
        startAnimation()
        setHiddenBtnsClickListeners()
    }


    override fun openHomeActivity() {
        homeActivity()
    }

    override fun openLoginActivity() {
        loginActivity()
    }


    private fun homeActivity(){
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish()
    }


    private fun loginActivity(){
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()

    }

    private fun startAnimation() {
        val valueAnimator = ValueAnimator.ofFloat(0f, 1f)
        valueAnimator.addUpdateListener {
            val value = it.animatedValue as Float
            imageView.scaleX = value
            imageView.scaleY = value
        }
        valueAnimator.interpolator = BounceInterpolator()
        valueAnimator.duration = ANIMATION_DURATION


        addAnimListener(valueAnimator)
        // Set animator listener.
        //val intent = Intent(this, MainActivity::class.java)
    }

    private fun startLoginAnimation() {

        current_user_btn.visibility = View.VISIBLE
        new_user_btn.visibility = View.VISIBLE
        val valueAnimator = ValueAnimator.ofFloat(0f, 1f)

        valueAnimator.addUpdateListener {
            val value = it.animatedValue as Float

            current_user_btn.scaleY = value
            new_user_btn.scaleY = value
        }
        valueAnimator.duration = ANIMATION_DURATION

        addLoginLoginAnimListener(valueAnimator)
    }

    private fun addLoginLoginAnimListener(valueAnimator: ValueAnimator){
        valueAnimator.addListener(object : Animator.AnimatorListener {
            override fun onAnimationRepeat(p0: Animator?) {

            }

            override fun onAnimationEnd(p0: Animator?) {
                // Navigate to main activity on navigation end.

                setHiddenBtnsClickListeners()
            }

            override fun onAnimationCancel(p0: Animator?) {

            }

            override fun onAnimationStart(p0: Animator?) {
            }

        })

        // Start animation.
        valueAnimator.start()
    }

    private fun addAnimListener(valueAnimator: ValueAnimator){
        valueAnimator.addListener(object : Animator.AnimatorListener {
            override fun onAnimationRepeat(p0: Animator?) {

                }

            override fun onAnimationEnd(p0: Animator?) {
                // Navigate to main activity on navigation end.

                validateCurrentUser()
            }

            override fun onAnimationCancel(p0: Animator?) {

            }

            override fun onAnimationStart(p0: Animator?) {
            }

        })

        // Start animation.
        valueAnimator.start()
    }

    override fun showUserInfo(user: User) {

    }


    fun isAuthenticated(): Boolean = presenter.isAuthenticated()



    fun validateCurrentUser() {
       if(! isAuthenticated()){

           startLoginAnimation()

       } else {

           homeActivity()
           presenter.subscribe()
       }

    }



    private fun setHiddenBtnsClickListeners() {
        current_user_btn.setOnClickListener { loginActivity() }
        new_user_btn.setOnClickListener { showNewUserInputs()  }
    }


    private fun showNewUserInputs(){
        hideSignInAndCreateBtns()
        showInputTexts()
        setCreateUserBtnListerner()
    }

    private fun hideSignInAndCreateBtns(){
        current_user_btn.visibility = View.GONE
        new_user_btn.visibility = View.GONE

    }


    private fun setCreateUserBtnListerner(){
        splash_register_btn.visibility = View.VISIBLE
        splash_register_btn.setOnClickListener {
            presenter.verifyUserInputs(splash_name_input.text.toString(),splash_email_input.text.toString(), splash_password_input.text.toString()) }

    }


    private fun showInputTexts(){
        splash_email_input.visibility = View.VISIBLE
        splash_password_input.visibility = View.VISIBLE
        splash_name_input.visibility = View.VISIBLE

    }

    override fun showErrorToast(err: String) {
        showCreateUserError(err)
    }

    private fun showCreateUserError(err:String){
        Toast.makeText(this, err, Toast.LENGTH_LONG).show()
    }
    override fun showError(err: String) {
        showEmailInputError(err)
        showPasswordInputError(err)
        showNameInputError(err)
    }
    private fun showNameInputError(err: String){
        splash_name_input.error = err
    }
    private fun showEmailInputError(err: String){
        splash_email_input.error = err
    }

    private fun showPasswordInputError(err: String){
        splash_password_input.error = err
    }


}
