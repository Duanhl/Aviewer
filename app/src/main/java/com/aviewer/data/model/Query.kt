package com.aviewer.data.model

data class TmpEntityQuery (
    val table: String,
    val sn: String?,
    val publishDate: String?,
    val offset: Int,
    val size: Int
)