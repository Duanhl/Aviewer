package com.aviewer.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.aviewer.data.model.Movie
import com.aviewer.data.model.MovieInfo
import com.aviewer.data.model.TmpEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface MovieDao {

    @Query(
        """
            select * from movie
            where sn = :sn
        """
    )
    fun queryMovie(sn: String): Flow<MovieInfo>

    @Query(
        """
            delete from movie
            where sn = :sn
        """
    )
    suspend fun deleteMovie(sn: String)

    @Insert
    fun insertMovie(movie: Movie): Long



}