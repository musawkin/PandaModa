package com.example.pandamoda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pandamoda.databinding.ActivityMainBinding
import com.example.pandamoda.databinding.FragmentCreateNewPasswordBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)


    }
}