package com.bbdev.app.fundstubclientapp.ui.home

import android.os.Bundle
import android.support.v4.app.Fragment
import android.widget.Toast
import co.zsmb.materialdrawerkt.builders.accountHeader
import co.zsmb.materialdrawerkt.builders.drawer
import co.zsmb.materialdrawerkt.draweritems.badgeable.primaryItem
import co.zsmb.materialdrawerkt.draweritems.badgeable.secondaryItem
import co.zsmb.materialdrawerkt.draweritems.divider
import com.bbdev.app.fundstubclientapp.App
import com.bbdev.app.fundstubclientapp.R
import com.bbdev.app.fundstubclientapp.ui.base.view.BaseActivity
import javax.inject.Inject


class HomeActivity : BaseActivity(), HomeMvpView {

    @Inject lateinit var presenter: HomeMvpPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null){
            supportFragmentManager.beginTransaction().add(R.id.home_container, HomeFragment()).commit()
        }
        App.instance.component.inject(this)
        setContentView(R.layout.activity_home)
        presenter = HomePresenter()
        presenter.onAttach(this)

        setUpDrawer()
    }

    private fun setUpDrawer(){
        var fragment: Fragment? = null

        drawer {
            accountHeader{
                this.backgroundDrawable = getDrawable(R.mipmap.baseball)!!.current

            }
            divider()
            primaryItem("Dashboard") {
                onClick { _->
                    supportFragmentManager.beginTransaction().replace(R.id.home_container, DashboardFragment()).commit()
                    return@onClick false
                }
            }
            divider()
            secondaryItem ("Home"){
                onClick { _->
                    supportFragmentManager.beginTransaction().replace(R.id.home_container, HomeFragment()).commit()
                    return@onClick false
                }
            }
            secondaryItem ("Account"){
                onClick { _->
                    supportFragmentManager.beginTransaction().replace(R.id.home_container, AccountFragment()).commit()
                    return@onClick false

                }
            }
            secondaryItem("Tickets") {
                onClick { _ ->
                    supportFragmentManager.beginTransaction().replace(R.id.home_container, Tickets()).commit()

                    return@onClick false
                }
            }
            secondaryItem("Auction") {
                onClick { _ ->

                    supportFragmentManager.beginTransaction().replace(R.id.home_container, Auction()).commit()
                    return@onClick false
                }
            }

            divider()
            primaryItem("Explore"){
                onClick { _->
                    fragment = ExploreFragment()
                    false
                }
            }
            divider()
            secondaryItem("Hot List") {
                onClick { _->
                    fragment = HotListFragment()
                    false
                }
            }
            secondaryItem("Bargain") {
                onClick { _->
                    fragment = BargainFragment()
                    false
                }

            }
        }

    }

    private fun showMessage(){
        Toast.makeText(this, "clicked", Toast.LENGTH_LONG).show()
    }

    private fun showCountdown(){


    }

}
