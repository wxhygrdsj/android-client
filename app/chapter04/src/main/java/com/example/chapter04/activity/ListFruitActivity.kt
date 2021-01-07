
package com.example.chapter04.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.chapter04.R
import com.example.chapter04.adapter.FruitAdapter
import com.example.chapter04.adapter.FruitAdapter2
import com.example.chapter04.model.Fruit
import kotlinx.android.synthetic.main.activity_listfruit.*

class ListFruitActivity : AppCompatActivity() {
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
        setContentView(R.layout.activity_listfruit)
        initFruits()
        var adapter = FruitAdapter2(this, R.layout.fruit_item, fruits)
        listfruit.adapter=adapter
        listfruit.setOnItemClickListener{
            parent, view, position, id ->
            var fruit=fruits[position]
            Toast.makeText(this,fruit.name,Toast.LENGTH_LONG).show()
        }

    }
}