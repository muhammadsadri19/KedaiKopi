package com.muhammadsadri.kedaikopi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menufood)

        val menuFoodList = listOf<MenuFood>(
            MenuFood(
                R.drawable.burger,
                "Rp 50.000,00",
                "Burger"
            ),
            MenuFood(
                R.drawable.pizza,
                "Rp 50.000,00",
                "Pizza"
            ),
            MenuFood(
                R.drawable.spagetti,
                "Rp 50.000,00",
                "Spaghetti"
            ),
            MenuFood(
                R.drawable.french,
                "Rp 50.000,00",
                "French Farian"
            ),
        )

        val recycleView = findViewById<RecyclerView>(R.id.hero)
        recycleView.layoutManager =LinearLayoutManager(this)
        recycleView.setHasFixedSize(true)
        recycleView.adapter = FoodAdapter(this, menuFoodList){

        }
    }
}