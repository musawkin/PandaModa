package com.example.pandamoda.Authorization

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pandamoda.R
import com.example.pandamoda.databinding.FragmentAuthButtomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlin.contracts.contract

class AuthButtomSheetFragment : BottomSheetDialogFragment() {
    private var binding: FragmentAuthButtomSheetBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        binding = FragmentAuthButtomSheetBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }



}