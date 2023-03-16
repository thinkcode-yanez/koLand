package com.thinkcode.koland.ui.view.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.thinkcode.koland.ui.view.fragments.MoviesFragment
import com.thinkcode.koland.ui.view.fragments.PeopleFragment
import com.thinkcode.koland.ui.view.fragments.SeriesFragment

class FragmentPageAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> SeriesFragment()
            1-> MoviesFragment()
            2->PeopleFragment()
            else->Fragment()
        }
    }


}