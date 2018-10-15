package com.bbdev.app.fundstubclientapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by wn 17/01000.
 */
data class OpenSource(@Expose
                      @SerializedName("project_url")
                      var projectUrl: String? = null,

                      @Expose
                      @SerializedName("img_url")
                      var coverImgUrl: String? = null,

                      @Expose
                      @SerializedName("title")
                      var title: String? = null,

                      @Expose
                      @SerializedName("description")
                      var description: String? = null)