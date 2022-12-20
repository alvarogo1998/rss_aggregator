package com.agalobr.rss_aggregator.features.data.local.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

const val TABLE_NAME_RSS = "rss"
const val Pk_NAME_RSS = "url"

@Entity(tableName = TABLE_NAME_RSS)
data class RssEntity(
    @ColumnInfo(name = "name") val name: String,
    @PrimaryKey @ColumnInfo(name = Pk_NAME_RSS) val url: String
)