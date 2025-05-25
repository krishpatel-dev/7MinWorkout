package com.krishhh.a7minutesworkout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast
import com.krishhh.a7minutesworkout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // if there is two ids with same name in two diff xml files then this binding method will only use id from provided xml file
    // basically it prevent app from unexpected crashing and make the app efficient
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        // val fLStartButton: FrameLayout = findViewById(R.id.flStart)
        binding?.flStart?.setOnClickListener{
        // fLStartButton.setOnClickListener {
            val intent = Intent(this, ExerciseActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}