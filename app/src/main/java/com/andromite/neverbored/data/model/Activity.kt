package com.andromite.neverbored.data.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Activity(
    @Json(name = "accessibility")
    val accessibility: Double,
    @Json(name = "activity")
    val activity: String,
    @Json(name = "key")
    val key: String,
    @Json(name = "link")
    val link: String,
    @Json(name = "participants")
    val participants: Int,
    @Json(name = "price")
    val price: Float,
    @Json(name = "type")
    val type: String
)