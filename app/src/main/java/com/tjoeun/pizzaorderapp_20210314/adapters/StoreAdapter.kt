package com.tjoeun.pizzaorderapp_20210314.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.tjoeun.pizzaorderapp_20210314.R
import com.tjoeun.pizzaorderapp_20210314.datas.Store

class StoreAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Store>) : ArrayAdapter<Store>(mContext, resId, mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.store_list_item, null)
        }

        val row = tempRow!!

        return row
    }

}