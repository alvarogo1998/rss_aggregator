package com.agalobr.rss_aggregator.features.data.local.db

import com.agalobr.rss_aggregator.features.data.local.RssLocalDataSource

class RssDbLocalDataSource (private val dao: RssDao): RssLocalDataSource{

    override fun createRss(name: String, url: String) {
        dao.create(RssEntity(name, url))
    }

}