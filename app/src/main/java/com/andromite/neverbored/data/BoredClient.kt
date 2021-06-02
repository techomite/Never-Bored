package com.andromite.neverbored.data

import com.andromite.neverbored.data.service.BoredAPI
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


class BoredClient {

    var retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://www.boredapi.com/api/")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    var api = retrofit.create(BoredAPI::class.java)



}