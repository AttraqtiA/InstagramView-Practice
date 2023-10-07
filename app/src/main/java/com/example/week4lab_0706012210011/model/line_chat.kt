package com.example.week4lab_0706012210011.model

import androidx.annotation.DrawableRes

data class line_chat(
    @DrawableRes val profile_picture: Int,
    val name: String,
    val recent_message: String,
    val date: String
)
