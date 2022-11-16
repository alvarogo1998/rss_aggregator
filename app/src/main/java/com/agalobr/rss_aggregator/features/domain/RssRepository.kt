package com.agalobr.rss_aggregator.features.domain

interface RssRepository {
    fun save (name: String, url: String): Rss?
}