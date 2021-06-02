package com.andromite.neverbored.ui.mainActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.andromite.neverbored.R

class MainActivity : AppCompatActivity() {

    private lateinit var maViewModel: MAViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        maViewModel = ViewModelProvider(this).get(MAViewModel::class.java)


    }
}