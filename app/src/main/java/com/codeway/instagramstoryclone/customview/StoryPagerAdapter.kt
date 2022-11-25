package com.codeway.instagramstoryclone.customview

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.viewpager.widget.ViewPager
import com.codeway.instagramstoryclone.data.StoryUser
//import com.codeway.instagramstoryclone.domain.model.User
import com.codeway.instagramstoryclone.presentation.screen.StoryDisplayFragment

class StoryPagerAdapter constructor(fragmentManager: FragmentManager, private val storyList: ArrayList<StoryUser>)
    : FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): Fragment = StoryDisplayFragment.newInstance(position, storyList[position])

    override fun getCount(): Int {
        return storyList.size
    }

    fun findFragmentByPosition(viewPager: ViewPager, position: Int): Fragment? {
        try {
            val f = instantiateItem(viewPager, position)
            return f as? Fragment
        } finally {
            finishUpdate(viewPager)
        }
    }
}