package com.bondidos.myapplication

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Product (
    val arr : List<Any>

        )

/*
@JsonClass(generateAdapter = true)
data class Values(
    @Json(name = "id") val id: String
)*/
