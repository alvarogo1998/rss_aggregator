package com.agalobr.rss_aggregator.features.domain

class SaveRssUseCase (private val repository: RssRepository){
    fun execute (name: String, url: String) = repository.saveRss(name, url)
}