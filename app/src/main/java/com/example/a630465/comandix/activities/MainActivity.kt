package com.example.a630465.comandix.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import com.example.a630465.comandix.R
import com.example.a630465.comandix.fragments.BillFragment
import com.example.a630465.comandix.fragments.DishesFragment
import com.example.a630465.comandix.fragments.TableFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()  {

    val ID_DEFAULT_FRAGMENT = R.id.action_tables

    val fragments: HashMap<Int, Fragment> = hashMapOf(
            Pair(R.id.action_tables, TableFragment()),
            Pair(R.id.action_dishes, DishesFragment())
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView(savedInstanceState)

        navigationView.selectedItemId = R.id.action_tables
        navigationView.setOnNavigationItemSelectedListener { item ->
            val fragment : Fragment? = fragments[item.itemId]

            if(fragment != null) {
                replaceFragment(R.id.fragment_container, fragment)
            }
            true
        }
    }

    fun initView(savedInstanceState: Bundle?) {
        val currentFragment = supportFragmentManager.findFragmentById(R.id.fragment_container)

        if (currentFragment == null) {
            supportFragmentManager.beginTransaction()
                    .add(R.id.fragment_container, defaultFragment())
                    .commit()
        }
    }

    private fun replaceFragment(container: Int, fragment: Fragment) {
        supportFragmentManager
                .beginTransaction()
                .replace(container, fragment)
                .commit()
    }

    private fun defaultFragment() = fragments[ID_DEFAULT_FRAGMENT]

}
