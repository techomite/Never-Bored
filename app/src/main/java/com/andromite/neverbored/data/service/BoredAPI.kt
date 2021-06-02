package com.andromite.neverbored.data.service

import com.andromite.neverbored.data.model.Activity
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface BoredAPI {

    @GET("activity")
    fun getActivityDetails():Call<Activity>

}