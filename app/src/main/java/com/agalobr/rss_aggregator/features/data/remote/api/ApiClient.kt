package com.agalobr.rss_aggregator.features.data.remote.api

import retrofit2.Retrofit
import retrofit2.converter.simplexml.SimpleXmlConverterFactory

/**
 * Retrofit
 */
class ApiClient {

    private val apiServices: ApiServices

    init {
        apiServices = buildApiEndPoint()
    }

    private fun buildApiEndPoint() =
        createRetrofitClient().create(ApiServices::class.java)

    private fun createRetrofitClient() = Retrofit.Builder()
        .baseUrl("https://api.github.com/")
        .addConverterFactory(SimpleXmlConverterFactory.create())
        .build();

    suspend fun getRss(urlRss: String) = apiServices.getRss(urlRss).body()!!
}