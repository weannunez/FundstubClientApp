package com.bbdev.app.fundstubclientapp.ui.base.view

import android.app.ProgressDialog
import android.support.v4.app.Fragment


/**
 * Created by wn 12/01000.
 */
abstract class BaseFragment : Fragment() {

    private var parentActivity: BaseActivity? = null
    private var progressDialog: ProgressDialog? = null

}