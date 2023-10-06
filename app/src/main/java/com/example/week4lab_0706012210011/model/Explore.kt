package com.example.week4lab_0706012210011.model

import android.content.Context

data class Explore(
    val content: String
) {
    // buat return @DrawableRes val : Int,

    fun ConvertDrawable(context: Context): Int {
        return context.resources.getIdentifier(content, "drawable", context.packageName)
    }
}

//val drawableIds = JsonUtils.convertJsonToDrawables(this, R.raw.explore)
//
//val exploreList = drawableIds.map { Explore(it) }

