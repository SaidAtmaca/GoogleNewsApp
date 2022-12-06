package com.example.googlenewsapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.googlenewsapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager= supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val feedFragment= FeedFragment()
        fragmentTransaction.add(R.id.frameLayout,feedFragment).commit()
    }
}

