package com.aviewer.data.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.RawQuery
import androidx.sqlite.db.SupportSQLiteQuery
import com.aviewer.data.model.TmpEntity
import com.aviewer.data.model.TmpEntityQuery

@Dao
interface TmpEntityDao {

    @Query(
        """
            insert into :table (sn, site, publish_date, title, cover, url)
            values(:entry.sn, :entry.site, :entry.publishDate, :entry.title, :entry.cover, :entry.url)
        """
    )
    fun insertTmpEntity(table: String, entry: TmpEntity): Long

    @RawQuery
    fun pageQueryTmpEntity(query: SupportSQLiteQuery): List<TmpEntity>
}