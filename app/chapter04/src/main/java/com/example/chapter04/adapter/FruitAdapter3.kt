package com.example.chapter04.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.chapter04.R
import com.example.chapter04.model.Fruit
import kotlinx.android.synthetic.main.fruit_item.view.*

class FruitAdapter3(val fruitList:List<Fruit>):RecyclerView.Adapter<FruitAdapter3.ViewHolder>(){
    inner class ViewHolder(view:View):RecyclerView.ViewHolder(view){
        val fruitImage:ImageView=view.findViewById(R.id.fruitImage)
        val fruitName:TextView=view.findViewById(R.id.fruitName)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitAdapter3.ViewHolder {
        var inflater = LayoutInflater.from(parent.context)
        var view = inflater.inflate(R.layout.fruit_item, parent, false)
        var viewHolder=ViewHolder(view)
        viewHolder.itemView.setOnClickListener{
            val position=viewHolder.adapterPosition
            var fruit=fruitList[position]
            Toast.makeText(parent.context,fruit.name, Toast.LENGTH_LONG).show()

        }
        viewHolder.fruitImage.setOnClickListener {
            val position=viewHolder.adapterPosition
            var fruit=fruitList[position]
            Toast.makeText(parent.context,fruit.name, Toast.LENGTH_LONG).show()
        }
        viewHolder.fruitName.setOnClickListener {
            val position=viewHolder.adapterPosition
            var fruit=fruitList[position]
            Toast.makeText(parent.context,fruit.name, Toast.LENGTH_LONG).show()
        }
        return viewHolder

    }
    override fun getItemCount(): Int {
        return fruitList.size
    }
    override fun onBindViewHolder(holder: FruitAdapter3.ViewHolder, position: Int) {
        var fruit = fruitList[position]
        holder.fruitImage.setImageResource(fruit.imageId)
        holder.fruitName.text=fruit.name
    }



}