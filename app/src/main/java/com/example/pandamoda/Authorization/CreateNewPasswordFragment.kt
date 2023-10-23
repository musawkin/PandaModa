package com.example.pandamoda.Authorization

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.pandamoda.R
import com.example.pandamoda.databinding.FragmentCreateNewPasswordBinding


class CreateNewPasswordFragment : Fragment() {
    private var binding: FragmentCreateNewPasswordBinding? = null
    //FragmentCreateNewPasswordBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        binding = FragmentCreateNewPasswordBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.materialButtonConfirm?.setOnClickListener {
            findNavController().navigate(R.id.authButtomSheetFragment)
        }
    }


}