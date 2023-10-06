package com.example.week4lab_0706012210011.utils

import android.content.Context
import com.google.gson.Gson
import com.google.gson.JsonArray
import com.google.gson.JsonSyntaxException

object JsonUtils {
    fun convertJson_Explore(context: Context, resourceId: Int): List<Int> {
        val json = try {
            val inputStream = context.resources.openRawResource(resourceId)
            val size = inputStream.available()
            val buffer = ByteArray(size)
            inputStream.read(buffer)
            inputStream.close()
            String(buffer, Charsets.UTF_8)
        } catch (ex: Exception) {
            ex.printStackTrace()
            ""
        }

        val gson = Gson()
        val jsonArray = try {
            gson.fromJson(json, JsonArray::class.java)
        } catch (ex: JsonSyntaxException) {
            ex.printStackTrace()
            JsonArray()
        }

        val drawableIds = mutableListOf<Int>()
        for (jsonElement in jsonArray) {
            if (jsonElement.isJsonObject) {
                val jsonObject = jsonElement.asJsonObject
                if (jsonObject.has("content") && jsonObject.get("content").isJsonPrimitive) {
                    val content = jsonObject.get("content").asString
                    val resourceId = context.resources.getIdentifier(content, "drawable", context.packageName)
                    if (resourceId != 0) {
                        drawableIds.add(resourceId)
                    }
                }
            }
        }

        return drawableIds
    }
}
