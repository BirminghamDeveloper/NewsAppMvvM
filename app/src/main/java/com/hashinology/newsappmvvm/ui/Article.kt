package com.hashinology.newsappmvvm.ui

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "articleTable"
)
data class Article(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    val author: String,
    val publishedAt: String,
    val source: Source,
    val title: String,
    val url: String
)