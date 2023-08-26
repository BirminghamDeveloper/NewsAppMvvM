package com.hashinology.newsappmvvm.ui.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.hashinology.newsappmvvm.ui.Article

@Dao
interface ArticleDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upser(article: Article): Long

    @Query("SELECT * FROM articleTable")
    fun getAllArticle(): LiveData<List<Article>>

    @Delete
    suspend fun deleteArticle(article: Article)
}