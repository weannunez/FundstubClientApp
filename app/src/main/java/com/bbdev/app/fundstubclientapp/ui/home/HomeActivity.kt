package com.bbdev.app.fundstubclientapp.ui.home

import android.annotation.TargetApi
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import co.zsmb.materialdrawerkt.builders.accountHeader
import co.zsmb.materialdrawerkt.builders.drawer
import co.zsmb.materialdrawerkt.builders.footer
import co.zsmb.materialdrawerkt.draweritems.badge
import co.zsmb.materialdrawerkt.draweritems.badgeable.primaryItem
import co.zsmb.materialdrawerkt.draweritems.badgeable.secondaryItem
import co.zsmb.materialdrawerkt.draweritems.profile.profile
import co.zsmb.materialdrawerkt.draweritems.sectionHeader
import co.zsmb.materialdrawerkt.imageloader.drawerImageLoader
import com.bbdev.app.fundstubclientapp.App
import com.bbdev.app.fundstubclientapp.R
import com.bbdev.app.fundstubclientapp.ui.base.view.BaseActivity
import io.reactivex.disposables.CompositeDisposable
import kotlinx.android.synthetic.main.activity_home.*
import javax.inject.Inject

class HomeActivity : BaseActivity(), HomeMvpView {

    @Inject
    lateinit var presenter: HomeMvpPresenter
    val compositeDisposable: CompositeDisposable = CompositeDisposable()

    @TargetApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        App.instance.component.inject(this)
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().add(R.id.home_container, HomeFragment()).commit()
        }
        setContentView(R.layout.activity_home)
        setSupportActionBar(toolbar_home!!)
        presenter = HomePresenter()
        presenter.onAttach(this)



        /*drawer {


            accountHeader {
                drawerImageLoader {
                    background = R.mipmap.baseball
                    profile("Paul Martinez", "pmart@gmail.com") {
                        icon = R.drawable.account
                    }
                    builder.withHeightDp(20)

                }
            }
            sectionHeader("My Stuff")

            primaryItem("My Account") {
                icon = R.drawable.account

                sectionHeader("     Balance")

                secondaryItem("             Total Amount:   ") {
                    badge("$ 57.89") {
                        color = 0xfff

                    }

                }
                sectionHeader("     Plan")

                secondaryItem("             Payments:   ") {
                    badge("$ 23.40") {
                        color = 0xfff
                    }
                }
                secondaryItem("             Occurance:  ") {
                    badge("Weekly") {
                        color = 0xfff
                    }
                }
                secondaryItem("             Payments Remaining: ") {
                    badge("3") {
                        color = 0xfff
                    }
                }
            }

            primaryItem("My Events") {
                icon = R.drawable.ic_local_play_black_24dp

                sectionHeader("     Up Coming")

                secondaryItem("             Event   ") {
                    badge("Electric Daily  Carnaval")
                }
                secondaryItem("             Date    ") {
                    badge("July 20, 2018")
                }
            }

            onItemClick { view, position, drawerItem ->
                Log.d("DRAWER", "Clicked!")
                true
            }
            onSlide { _, _ ->
                Log.d("DRAWER", "Sliding")
            }
            onClosed {
                Log.d("DRAWER", "Closed")
            }
            onOpened {
                Log.d("DRAWER", "Opened")
            }


            sectionHeader("Explore All Events")

            primaryItem("Sports") {
            //    icon = R.drawable.ic_local_play_black_24dp

                primaryItem("NFL") {
                    badge("Teams")

                    primaryItem {
                        badge("Atlanta Falcons")
                    }
                    primaryItem {
                        badge("Denver Broncos")
                    }
                }
            }
            primaryItem("Music") {
            //    icon = R.drawable.ic_local_play_black_24dp

                primaryItem("Artists") {
                    badge("Pop")

                    primaryItem {
                        badge("Beyonce")
                    }
                    primaryItem{
                        badge("Taylor Swift")
                    }

                }
            }
            primaryItem("Conventions") {
              //  icon = R.drawable.ic_local_play_black_24dp

                //primaryItem("Tickets") {
                //   icon = R.drawable.navigation_empty_icon
                //  }.withBadge("10")

            }
            footer {

                primaryItem("               Shop For Tickets!") {
                    icon = R.drawable.ic_local_play_black_24dp
                    textColor = 0x000
                }
            }

        }
    }
            divider()
                    primaryItem("Dashboard") {
                        onClick { _ ->
                            supportFragmentManager.beginTransaction().replace(R.id.home_container, DashboardFragment())
                                .commit()
                            return@onClick false
                        }
                    }
                    divider()
                    secondaryItem("Home") {
                        onClick { _ ->
                            supportFragmentManager.beginTransaction().replace(R.id.home_container, HomeFragment())
                                .commit()
                            return@onClick false
                        }
                    }
                    secondaryItem("Account") {
                        onClick { _ ->
                            supportFragmentManager.beginTransaction().replace(R.id.home_container, AccountFragment())
                                .commit()
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
                    primaryItem("Explore") {
                        onClick { _ ->
                            supportFragmentManager.beginTransaction().replace(R.id.home_container, ExploreFragment())
                                .commit()
                            return@onClick false
                        }
                    }
                    divider()
                    secondaryItem("Hot List") {
                        onClick { _ ->
                            supportFragmentManager.beginTransaction().replace(R.id.home_container, HotListFragment())
                                .commit()
                            return@onClick false
                        }
                    }
                    secondaryItem("Bargain") {
                        onClick { _ ->
                            supportFragmentManager.beginTransaction().replace(R.id.home_container, BargainFragment())
                                .commit()
                            return@onClick false
                        }

                    }
                }
            }
        }
    }*/
    }

    override fun showToast() {

            Toast.makeText(this, "clicked", Toast.LENGTH_LONG).show()
    }

}
