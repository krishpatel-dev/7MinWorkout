package com.krishhh.a7minutesworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.krishhh.a7minutesworkout.databinding.ActivityFinishBinding

class FinishActivity : AppCompatActivity() {
    // Create a binding variable
    private var binding: ActivityFinishBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // inflate the layout
        binding = ActivityFinishBinding.inflate(layoutInflater)
        // bind the layout to this Activity
        setContentView(binding?.root)
        // attach the layout to this activity
        setSupportActionBar(binding?.toolbarFinishActivity)
        if (supportActionBar != null) {
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }
        binding?.toolbarFinishActivity?.setNavigationOnClickListener {
            onBackPressed()
        }

        binding?.btnFinish?.setOnClickListener {
            finish()
        }
    }
}