package com.example.chapter04.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.chapter04.R
import com.example.chapter04.model.Fruit
import kotlinx.android.synthetic.main.fruit_item.view.*

class FruitAdapter2(activity: Activity, val resourceId:Int, data:List<Fruit>)
    :ArrayAdapter<Fruit>(activity,resourceId,data) {
    inner class ViewHolder(val fruitImage:ImageView,val fruitName:TextView)
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        //缓存
        val view:View
        val viewHolder:ViewHolder
        if(convertView==null){
            /**
             * attachToRoot 默认值是True，把当前文件加载到parent下
             * false,不加载到parent下
             */
            view=LayoutInflater.from(context).inflate(resourceId, parent, false)
            val fruitImage:ImageView = view.findViewById(R.id.fruitImage)
            val fruitName:TextView = view.findViewById(R.id.fruitName)
            viewHolder=ViewHolder(fruitImage,fruitName)
            view.tag=viewHolder
        }else{
            view=convertView
            viewHolder=view.tag as ViewHolder
        }
        //1.加载布局文件
        //var view = LayoutInflater.from(context).inflate(resourceId, parent, false)
        //2.加载view中的组件

        //3.判断当前项
        var fruit = getItem(position)
        //4.判断fruilt是否为null
        if(fruit!=null){
            viewHolder.fruitImage.setImageResource(fruit.imageId)
            viewHolder.fruitName.text=fruit.name
        }
        return view
    }
}