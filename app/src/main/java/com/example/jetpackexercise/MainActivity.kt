package com.example.jetpackexercise

import android.R.attr.fragment
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val linearLayoutManager= LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        recyclerview.layoutManager=linearLayoutManager
        val userAdapter=MyAdapter(prepareData())
        recyclerview.adapter=userAdapter


    }

    private fun prepareData(): ArrayList<User> {


        var user1=User("priya")
        var user2=User("priya12")
        var user3=User("priya233")
        var user4=User("priya23")
        var user5=User("priyaihs")




        return arrayListOf<User>(user1,user2,user3,user4,user5,user1,user2,user3,user4,user5,user1,user2,user3,user4,user5,user1,user2,user3,user4,user5)
    }

}