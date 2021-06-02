package com.andromite.neverbored

import com.andromite.neverbored.data.BoredClient
import org.junit.Test

import org.junit.Assert.*


class ExampleUnitTest {

    @Test
    fun `GET bored activity`(){
        val activity = BoredClient().api.getActivityDetails().execute()
        assertNotNull(activity.body()?.activity)
    }
}