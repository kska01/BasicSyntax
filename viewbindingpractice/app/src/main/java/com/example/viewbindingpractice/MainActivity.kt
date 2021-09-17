package com.example.viewbindingpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewbindingpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.button.setOnClickListener {
            binding.textView.text = "Hello Kotlin"
        }
    }
}