package com.agalobr.rss_aggregator

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import com.agalobr.app.db.AppDataBase
import com.agalobr.rss_aggregator.features.data.local.db.RssDbLocalDataSource
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch {
            RssDbLocalDataSource(
                DataBaseSingleton.getInstance(applicationContext).rssDao()
            ).createRss("Marca F1", "https://e00-marca.uecdn.es/rss/motor/formula1.xml")
        }
    }

    object DataBaseSingleton {
        private var db: AppDataBase? = null

        fun getInstance(context: Context): AppDataBase {
            if (db == null) {
                db = Room.databaseBuilder(
                    context,
                    AppDataBase::class.java, "db_rss"
                ).build()
            }
            return db!!
        }
    }
}