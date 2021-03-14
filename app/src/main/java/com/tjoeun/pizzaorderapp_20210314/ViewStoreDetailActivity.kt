package com.tjoeun.pizzaorderapp_20210314

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.tjoeun.pizzaorderapp_20210314.datas.Store
import kotlinx.android.synthetic.main.activity_view_store_detail.*

class ViewStoreDetailActivity : BaseActivity() {

    lateinit var mStoreData : Store

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

        mStoreData = intent.getSerializableExtra("store") as Store

        nameTxt.text = mStoreData.storeName
        phoneNumTxt.text = mStoreData.phoneNum

        Glide.with(mContext).load(mStoreData.logoUrl).into(logoImg)

    }

}