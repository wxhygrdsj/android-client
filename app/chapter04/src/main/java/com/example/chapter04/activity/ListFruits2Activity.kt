package com.example.chapter04.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chapter04.R
import com.example.chapter04.adapter.FruitAdapter
import com.example.chapter04.adapter.FruitAdapter3
import com.example.chapter04.model.Fruit
import kotlinx.android.synthetic.main.activity_listfruit2.*

class ListFruits2Activity : AppCompatActivity() {
    //创建List对象fruits,用于保存fruit对象
    private val fruits=ArrayList<Fruit>()
    private fun initFruits(){
        repeat(3){
            fruits.add(Fruit("Apple",R.drawable.apple_pic))
            fruits.add(Fruit("Banana",R.drawable.banana_pic))
            fruits.add(Fruit("Orange",R.drawable.orange_pic))
            fruits.add(Fruit("Watermelon",R.drawable.watermelon_pic))
            fruits.add(Fruit("Pear",R.drawable.pear_pic))
            fruits.add(Fruit("Grape",R.drawable.grape_pic))
            fruits.add(Fruit("Pineapple",R.drawable.pineapple_pic))
            fruits.add(Fruit("Strawberry",R.drawable.strawberry_pic))
            fruits.add(Fruit("cherry",R.drawable.cherry_pic))
            fruits.add(Fruit("Mango",R.drawable.mango_pic))

        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listfruit2)
        initFruits()
        var linearLayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager=linearLayoutManager
        var adapter = FruitAdapter3(fruits)
        recyclerView.adapter=adapter



    }
}