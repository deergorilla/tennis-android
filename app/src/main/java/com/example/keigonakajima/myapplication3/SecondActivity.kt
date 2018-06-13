package com.example.keigonakajima.myapplication3

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*

class SecondActivity : AppCompatActivity() {

    override fun onStart() {
        super.onStart()
        setContentView(R.layout.activity_second)  //レイアウトをセットする
         val listView = findViewById<ListView>(R.id.list_view)  //インスタンス化
        listView.adapter = ListAdapter(this)

    }


    class ListAdapter (private val context:SecondActivity) : BaseAdapter(){
        private val map1 = mapOf("username" to "木俣","comment" to "こんにちは")//map1は変数名、違う文字でもよい
        private val map2 = mapOf("username" to "中島","comment" to "こんばんわ")
        private val list = listOf(map1,map2,map1,map2)

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val convertView =  (context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater).inflate(R.layout.item_list,parent,false)
            convertView.findViewById<TextView>(R.id.list_1).text = list[position]["username"]//この文章
            convertView.findViewById<TextView>(R.id.list_2).text = list[position]["comment"]
            return convertView!!

        }

        override fun getItem(position: Int): Any {
            return 0
        }

        override fun getItemId(position: Int): Long {
            return 0
        }

        override fun getCount(): Int {
            return list.size
        }

    }

}
