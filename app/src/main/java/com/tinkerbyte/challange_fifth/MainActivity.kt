package com.tinkerbyte.challange_fifth

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        itemSelected.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                var myItem:ArrayList<String> = ArrayList()
                myItem.add("You have Selected:")
                if(first.isChecked)
                    myItem.add(first.text.toString())
                if(second.isChecked)
                    myItem.add(second.text.toString())
                if(third.isChecked)
                    myItem.add(third.text.toString())
                if(fourth.isChecked)
                    myItem.add(fourth.text.toString())
                if(myItem.size>1)
                    mTextView.text = myItem.toString()
                else
                    mTextView.text = "Items Not Selected"




            }
        })
    }
}
