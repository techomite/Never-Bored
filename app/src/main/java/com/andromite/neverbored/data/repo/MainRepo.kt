package com.andromite.neverbored.data.repo

import com.andromite.neverbored.data.BoredClient

class MainRepo {

    val api = BoredClient().api

    suspend fun getActivity() = api.getActivityDetails().body()

}