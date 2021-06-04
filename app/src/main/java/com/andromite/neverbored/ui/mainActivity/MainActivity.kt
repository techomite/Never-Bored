package com.andromite.neverbored.ui.mainActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.andromite.neverbored.R

class MainActivity : AppCompatActivity() {

    private lateinit var maViewModel: MAViewModel

    lateinit var getIdea : TextView
    lateinit var activityTextView : TextView
    lateinit var progressBar : ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getIdea = findViewById(R.id.getIdeaButton)
        activityTextView = findViewById(R.id.activityTextView)
        progressBar = findViewById(R.id.progressBar)

        maViewModel = ViewModelProvider(this).get(MAViewModel::class.java)
        callAPI()



        maViewModel.activity.observe(this, {
            progressBar.visibility = View.GONE
            activityTextView.text = it.activity
        })

        getIdea.setOnClickListener {
           callAPI()
        }
    }

    fun callAPI(){
        progressBar.visibility = View.VISIBLE
        maViewModel.fetchArticle()
    }
}