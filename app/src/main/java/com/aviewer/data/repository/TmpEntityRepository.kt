package com.aviewer.data.repository

import com.aviewer.data.dao.TmpEntityDao
import com.aviewer.data.model.TmpEntity
import com.aviewer.data.model.TmpEntityQuery
import dagger.hilt.android.qualifiers.ApplicationContext
import java.lang.StringBuilder
import javax.inject.Inject

class TmpEntityRepository @Inject constructor(
    @ApplicationContext private val context: ApplicationContext,
    private val tmpEntityDao: TmpEntityDao
) {

    suspend fun pageQueryTmpEntity(query: TmpEntityQuery): List<TmpEntity> {
        val sb = StringBuilder()
        val args = arrayListOf<String>()
        sb.append("select * from ? ")
        args.add(query.table)

        sb.append("where 1 = 1 ")
        if (query.sn != null) {
            sb.append(" and sn = ? ")
            args.add(query.sn)
        }

        if(query.publishDate != null) {
            sb.append(" and publish_date = ? ")
            args.add(query.publishDate)
        }

        sb.append(" order by id")
        sb.append("limit ?, ?")
        return emptyList()
    }
}