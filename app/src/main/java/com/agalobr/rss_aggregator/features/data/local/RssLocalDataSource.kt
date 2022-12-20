package com.agalobr.rss_aggregator.features.data.local

interface RssLocalDataSource {
    fun createRss (name: String, url: String)
}