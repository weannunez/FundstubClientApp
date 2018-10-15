package com.bbdev.app.fundstubclientapp.util.extension

import android.widget.ImageView
import com.bumptech.glide.Glide

/**
 * Created by wn 24/01000.
 */
internal fun ImageView.loadImage(url: String) {
    Glide.with(this.context)
            .load(url)
            .into(this)
}