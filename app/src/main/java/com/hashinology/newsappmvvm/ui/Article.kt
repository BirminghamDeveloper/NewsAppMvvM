package com.hashinology.newsappmvvm.ui

data class Article(
    val author: String,
    val publishedAt: String,
    val source: Source,
    val title: String,
    val url: String
)