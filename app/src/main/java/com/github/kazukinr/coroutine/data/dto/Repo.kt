package com.github.kazukinr.coroutine.data.dto

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = false)
data class Repo(
    val id: String,
    val name: String,
    val description: String?
)
