package com.thinkcode.koland.ui.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import com.thinkcode.koland.R
import com.thinkcode.koland.databinding.ActivityMainBinding
import com.thinkcode.koland.ui.view.adapters.FragmentPageAdapter


class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private lateinit var adapter:FragmentPageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setConfig()
    }

    private fun setConfig() {
        adapter = FragmentPageAdapter(supportFragmentManager,lifecycle)
        binding.viewpager2.adapter=adapter
       TabLayoutMediator(binding.tablayout,binding.viewpager2){tab,position->
           when(position){

               0->{
                   tab.text="Series"
                   tab.setIcon(R.drawable.baseline_home_24)
               }
               1->{
                   tab.text="Movies"
                   tab.setIcon(R.drawable.baseline_movie_creation_24)
               }
               2->{
                   tab.text="People"
                   tab.setIcon(R.drawable.baseline_recent_actors_24)
               }
           }
       }.attach()
    }
}