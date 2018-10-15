package com.bbdev.app.fundstubclientapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by wn 14/01000.
 */
data class OpenSourceResponse(@Expose
                              @SerializedName("status_code")
                              private var statusCode: String? = null,

                              @Expose
                              @SerializedName("message")
                              private var message: String? = null,

                              @Expose
                              @SerializedName("data")
                              var data: List<OpenSource>? = null)

