package com.andromite.neverbored

import com.andromite.neverbored.data.BoredClient
import kotlinx.coroutines.runBlocking
import org.junit.Test

import org.junit.Assert.*


class ExampleUnitTest {

    @Test
    fun `GET bored activity`() {
        runBlocking {
            val activity = BoredClient().api.getActivityDetails()
            assertNotNull(activity.body()?.activity)
        }
    }
}