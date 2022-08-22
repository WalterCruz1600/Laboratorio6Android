package com.example.laboratorio6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.*
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    private lateinit var bottomNav: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNav=findViewById(R.id.BottomNav_MainActivity)

        setListeners()

        setFragment(SearchFragment.newInstance("Walter Cruz","Hola"))

    }

    private fun setListeners() {
        bottomNav.setOnItemSelectedListener { item->
            when(item.itemId){
                R.id.Menu_Option_Home-> setFragment(SearchFragment.newInstance("Walter Cruz", "hola"))
                R.id.Menu_Option_Search-> setFragment(HomeFragment())
                R.id.Menu_Option_Library-> setFragment(LibraryFragment())
            }
            true
        }

    }

    private fun setFragment(fragment: androidx.fragment.app.Fragment){
        supportFragmentManager.commit{
            setReorderingAllowed(true)
            addToBackStack(null)
            replace(R.id.FragmentContainer_MainActivity, fragment)
        }

    }
}