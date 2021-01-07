package com.example.activitylife

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
//冒号表示继承，继承类：类名()
//继承接口 接口名
object ActivityController: AppCompatActivity() {
    private val activities= ArrayList<Activity>();
    fun addActivity(activity:Activity):Unit{
        activities.add(activity);
    }
    //delete
    //如果只有一行代码，可以省略{}，使用等号
    fun removeActivity(activity:Activity):Boolean=activities.remove(activity)
    fun finishAll(){
        /**
         * for循环遍历activity
         * 判断activity是否finish(),如果没有,finish
         * 清空链表
         */
        for(activity in activities){
            if(!activity.isFinishing){
                activity.finish();

            }
        }
        activities.clear();
    }


}