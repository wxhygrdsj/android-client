package com.example.menudemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MenuDemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //return super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.main2,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.add_item2-> Toast.makeText(this,"你选择了增加项",Toast.LENGTH_LONG).show()
            R.id.delete_item2-> Toast.makeText(this,"你选择了删除项",Toast.LENGTH_LONG).show()
        }
        //return super.onOptionsItemSelected(item)
        return true
    }

}
