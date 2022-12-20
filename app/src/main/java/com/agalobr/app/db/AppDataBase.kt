package com.agalobr.app.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.agalobr.rss_aggregator.features.data.local.db.RssDao
import com.agalobr.rss_aggregator.features.data.local.db.RssEntity

@Database(
    entities = [RssEntity::class],
    version = 1
)

abstract class AppDataBase : RoomDatabase (){
    abstract fun rssDao(): RssDao
}