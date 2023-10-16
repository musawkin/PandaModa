package com.example.pandamoda

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.pandamoda.databinding.PageForViewpagerBinding

class AdapterForIntroPager(private val pagesList: List<Int>): RecyclerView.Adapter<AdapterForIntroPager.PagerAdapter>() {

    class PagerAdapter(private var binding: PageForViewpagerBinding):ViewHolder(binding.root) {

        fun bind(data: Int) = with(binding){
            imageForPager.setImageResource(data)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerAdapter {
        val inflater = LayoutInflater.from(parent.context)
        var binding = PageForViewpagerBinding.inflate(inflater,parent,false)
        return PagerAdapter(binding)
    }

    override fun getItemCount() = pagesList.size


    override fun onBindViewHolder(holder: PagerAdapter, position: Int) {
        holder.bind(pagesList[position])
    }
}