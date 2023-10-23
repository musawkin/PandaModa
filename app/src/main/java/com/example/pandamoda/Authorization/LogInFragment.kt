package com.example.pandamoda.Authorization

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.pandamoda.R
import com.example.pandamoda.databinding.FragmentLogInBinding

class LogInFragment : Fragment() {
    private var binding: FragmentLogInBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        binding = FragmentLogInBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.tvSignUp?.setOnClickListener {
            findNavController().navigate(R.id.action_logInFragment_to_signUpFragment)

        }

        binding?.tvForgotPass?.setOnClickListener {
            findNavController().navigate(R.id.action_logInFragment_to_forgotPasswordFragment)
        }
    }

}