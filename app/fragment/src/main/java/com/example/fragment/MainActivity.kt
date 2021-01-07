package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDialogFragment
import androidx.fragment.app.Fragment
import com.example.fragment.frament.AnotherRightFragment
import kotlinx.android.synthetic.main.left_fragment.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val s=Gson()


        button.setOnClickListener {
            //replaceFragment(AnotherRightFragment())
        }
    }
//    private fun replaceFragment(fragment: Fragment){
//            var fragmentManager = supportFragmentManager
//            /**
//             * 系统通过fragmentManager.findFragmentById()获取fragment
//             * 可以使用fragment的方法
//             */
//
//            var transaction = fragmentManager.beginTransaction()
//            transaction.replace(R.id.rightLayout,fragment)
//            transaction.addToBackStack(null)
//            transaction.commit()
//    }
}
