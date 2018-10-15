package com.bbdev.app.fundstubclientapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by wn 17/01000.
 */
data class Blog(@Expose
                @SerializedName("blog_url")
                var blogUrl: String? = null,

                @Expose
                @SerializedName("img_url")
                var coverImgUrl: String? = null,

                @Expose
                @SerializedName("title")
                var title: String? = null,

                @Expose
                @SerializedName("description")
                var description: String? = null,

                @Expose
                @SerializedName("author")
                var author: String? = null,

                @Expose
                @SerializedName("published_at")
                var date: String? = null)