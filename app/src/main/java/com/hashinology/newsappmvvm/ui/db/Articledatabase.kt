package com.hashinology.newsappmvvm.ui.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.hashinology.newsappmvvm.ui.Article

@Database(
    entities = [Article::class],
    version = 1
)
abstract class Articledatabase: RoomDatabase() {
    abstract fun getArticleDao(): ArticleDao

    companion object{
        @Volatile
        private var instance: Articledatabase? = null


    }
}