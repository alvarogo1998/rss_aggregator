package com.agalobr.rss_aggregator.features.domain

interface RssRepository {
    fun saveRss (name: String, url: String): Rss?
}