package com.example.pandamoda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pandamoda.databinding.ActivityMainBinding
import com.example.pandamoda.databinding.DddBinding
import com.example.pandamoda.databinding.FragmentCreateNewPasswordBinding

class MainActivity : AppCompatActivity() {
    private var binding: DddBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DddBinding.inflate(layoutInflater)
        setContentView(binding?.root)


    }
}