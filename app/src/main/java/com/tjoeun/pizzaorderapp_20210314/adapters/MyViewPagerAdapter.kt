package com.tjoeun.pizzaorderapp_20210314.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.tjoeun.pizzaorderapp_20210314.fragments.MyProfileFragment
import com.tjoeun.pizzaorderapp_20210314.fragments.PizzaStoresFragment

class MyViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "피자 주문"
            else -> "내 정보 설정"
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> PizzaStoresFragment()
            else -> MyProfileFragment()
        }
    }
}