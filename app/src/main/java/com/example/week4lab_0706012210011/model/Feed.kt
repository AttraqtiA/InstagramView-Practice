package com.example.week4lab_0706012210011.model

import android.content.Context
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

data class Feed(
    val name: String,
    val profile: String,
    val content: String,
    var liked: Boolean,
    var saved: Boolean,
    val amount_like: Int,
    val caption: String,
    val date: String
) {
    fun ConvertProfile(context: Context): Int {
        return context.resources.getIdentifier(profile, "drawable", context.packageName)
    }

    fun ConvertContent(context: Context): Int {
        return context.resources.getIdentifier(content, "drawable", context.packageName)
    }

    fun formatDate(): String {
        val format_input = SimpleDateFormat("yyyy-MM-dd", Locale.US)
        val format_output = SimpleDateFormat("MMMM d, yyyy", Locale.US)

        val currentYear = SimpleDateFormat("yyyy", Locale.US).format(Date())
        val dateYear = SimpleDateFormat("yyyy", Locale.US).format(format_input.parse(date))

        return if (currentYear == dateYear) {
            format_output.applyPattern("MMMM d")
            format_output.format(format_input.parse(date))
        } else {
            format_output.format(format_input.parse(date))
        }
    }
}
