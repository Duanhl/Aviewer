package com.aviewer.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class MovieInfo (
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "sn") val sn: String,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "actresses") val actresses: String,
    @ColumnInfo(name = "duration") val duration: String,
    @ColumnInfo(name = "publish_date") val publishDate: String,
    @ColumnInfo(name = "producer") val producer: String,
    @ColumnInfo(name = "publisher") val publisher: String,
    @ColumnInfo(name = "series") val series: String,
    @ColumnInfo(name = "score") val score: String,
    @ColumnInfo(name = "wanted") val wanted: Int,
    @ColumnInfo(name = "liked") val liked: Int
)

@Entity
data class MovieImage (
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "sn") val sn: String,
    @ColumnInfo(name = "url") val url: String,
    @ColumnInfo(name = "type") val type: String,
    @ColumnInfo(name = "site") val site: String,
    @ColumnInfo(name = "fspath") val fsPath: String
)

@Entity
data class MovieTag (
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "sn") val sn: String,
    @ColumnInfo(name = "tag") val tag: String,
)

@Entity
data class MovieFs (
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "sn") val sn: String,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "site") val site: String,
    @ColumnInfo(name = "fspath") val fsPath: String
)

@Entity
data class Torrents (
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "sn") val sn: String,
    @ColumnInfo(name = "magnet") val magnet: String,
    @ColumnInfo(name = "site") val site: String,
    @ColumnInfo(name = "size") val size: String,
    @ColumnInfo(name = "dn") val dn: String,
    @ColumnInfo(name = "publish_date") val publishDate: String,
)

@Entity
data class ActressMovie (
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "actress") val actress: String,
    @ColumnInfo(name = "sn") val sn: String,
    @ColumnInfo(name = "publish_date") val publishDate: String,
)

@Entity
data class Actress (
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "actress") val actress: String,
    @ColumnInfo(name = "birthday") val birthday: String,
    @ColumnInfo(name = "used_name") val usedNames: String,
    @ColumnInfo(name = "high") val high: String,
    @ColumnInfo(name = "cup") val cup: String,
    @ColumnInfo(name = "wist") val wist: Int,
    @ColumnInfo(name = "hip") val hip: Int,
    @ColumnInfo(name = "chest") val chest: Int,
    @ColumnInfo(name = "avatar_source") val avatarUrl: Int,
    @ColumnInfo(name = "avatar_fs") val avatarFs: String,
)

@Entity
data class Comment (
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "sn") val sn: String,
    @ColumnInfo(name = "site") val site: String,
    @ColumnInfo(name = "comment") val comment: String,
    @ColumnInfo(name = "reply_id") val replyId: String,
    @ColumnInfo(name = "publish_date") val publishDate: String,
    @ColumnInfo(name = "user") val user: String,
)

@Entity
data class TmpEntity (
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "sn") val sn: String,
    @ColumnInfo(name = "site") val site: String,
    @ColumnInfo(name = "publish_date") val publishDate: String,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "cover") val cover: String,
    @ColumnInfo(name = "url") val url: String,
)

@Entity
data class Config (
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "section") val section: String,
    @ColumnInfo(name = "key") val key: String,
    @ColumnInfo(name = "value") val value: String,
)