package com.example.week4lab_0706012210011.model

import android.content.Context

data class Story(
    val name: String,
    val profile: String,
    val gajelas: Boolean,
    val gajelas2: Boolean
) {
    fun ConvertProfile(context: Context): Int {
        return context.resources.getIdentifier(profile, "drawable", context.packageName)
    }
}
