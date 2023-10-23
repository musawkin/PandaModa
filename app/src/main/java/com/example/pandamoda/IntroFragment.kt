package com.example.pandamoda

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.findFragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.example.pandamoda.databinding.FragmentIntroBinding
import kotlin.math.abs


class IntroFragment : Fragment() {
    private var binding: FragmentIntroBinding? = null
    private var adapterForIntroPager = AdapterForIntroPager(pagesList())

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentIntroBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init()

        binding?.introViewPager?.offscreenPageLimit = 3


        val onPageChangeCallback = object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {

                when (position) {
                    0 -> {
                        binding?.introCircle1?.setBackgroundResource(R.drawable.shape_circle_for_viewpager_fill)
                        binding?.introCircle2?.setBackgroundResource(R.drawable.shape_circle_for_viewpager)
                        binding?.introCircle3?.setBackgroundResource(R.drawable.shape_circle_for_viewpager)

                        binding?.tv1IntroPage?.text = "Discover something new"
                        binding?.tv2IntroPage?.text = "Special new arrivals just for you"
                    }

                    1 -> {
                        binding?.introCircle2?.setBackgroundResource(R.drawable.shape_circle_for_viewpager_fill)
                        binding?.introCircle1?.setBackgroundResource(R.drawable.shape_circle_for_viewpager)
                        binding?.introCircle3?.setBackgroundResource(R.drawable.shape_circle_for_viewpager)

                        binding?.tv1IntroPage?.text = "Update trendy outfit"
                        binding?.tv2IntroPage?.text = "Favorite brands and hottest trends"
                    }

                    else -> {
                    binding?.introCircle3?.setBackgroundResource(R.drawable.shape_circle_for_viewpager_fill)
                    binding?.introCircle2?.setBackgroundResource(R.drawable.shape_circle_for_viewpager)
                    binding?.introCircle1?.setBackgroundResource(R.drawable.shape_circle_for_viewpager)

                    binding?.tv1IntroPage?.text = "Explore your true style"
                    binding?.tv2IntroPage?.text = "Relax and let us bring the tyle to you"
                }
                }
            }
        }
        binding?.introViewPager?.registerOnPageChangeCallback(onPageChangeCallback)
        binding?.btShoppingNow?.setOnClickListener {
            findNavController().navigate(R.id.action_introFragment_to_auth_nav)
        }



    }

    private fun init(){
        binding?.introViewPager?.adapter = adapterForIntroPager

    }

    private fun pagesList() = listOf(
        R.drawable.photo_for_intro_page1,
        R.drawable.photo_for_intro_page2,
        R.drawable.photo_for_intro_page3
    )





}