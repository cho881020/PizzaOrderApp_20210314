package com.tjoeun.pizzaorderapp_20210314

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tjoeun.pizzaorderapp_20210314.adapters.MyViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    lateinit var mvpa : MyViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

        mvpa = MyViewPagerAdapter(supportFragmentManager)

        myViewPager.adapter = mvpa

    }


}