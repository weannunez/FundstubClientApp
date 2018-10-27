package com.bbdev.app.fundstubclientapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by wn 14/01000.
 */

data class OpenSourceResponse(@Expose
                              @SerializedName("name")
                              private var name: String? = null,

                              @Expose
                              @SerializedName("id")
                              private var eventId: String? = null,

                              @Expose
                              @SerializedName("url")
                              private var url: String? = null,

                              @Expose
                              @SerializedName("type")
                              private var type: String? = null,

                              @Expose
                              @SerializedName("data")
                              var data: List<OpenSource>? = null)

