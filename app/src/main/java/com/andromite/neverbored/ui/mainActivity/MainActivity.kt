package com.andromite.neverbored.ui.mainActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.andromite.neverbored.R

class MainActivity : AppCompatActivity() {

    private lateinit var maViewModel: MAViewModel

    lateinit var getIdea : Button
    lateinit var activityTextView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getIdea = findViewById(R.id.getIdeaButton)
        activityTextView = findViewById(R.id.activityTextView)

        maViewModel = ViewModelProvider(this).get(MAViewModel::class.java)


        maViewModel.activity.observe(this, {
            activityTextView.text = it.activity
        })

        getIdea.setOnClickListener {
            maViewModel.fetchArticle()
        }


    }
}