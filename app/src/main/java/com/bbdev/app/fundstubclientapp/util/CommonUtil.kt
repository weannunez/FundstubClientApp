package com.bbdev.app.fundstubclientapp.util

import android.app.ProgressDialog
import android.content.Context


/**
 * Created by wn 11/01000.
 */
object CommonUtil {

    fun showLoadingDialog(context: Context?): ProgressDialog {
        val progressDialog = ProgressDialog(context)
        progressDialog.let {
            it.show()
            it.isIndeterminate = true
            it.setCancelable(false)
            it.setCanceledOnTouchOutside(false)
            return it
        }
    }

}