package com.muhammadsadri.kedaikopi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivityDrink : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menudrink)

        val menuDrinkList = listOf<MenuDrink>(
            MenuDrink(
              R.drawable.coffe,
              "Rp 50.000,00",
                "Coffe"
            ),
            MenuDrink(
                R.drawable.juice,
                "Rp 50.000,00",
                "Juice"
            ),
            MenuDrink(
                R.drawable.fruite,
                "Rp 50.000,00",
                "Fruite Ice"
            ),
            MenuDrink(
                R.drawable.mineral,
                "Rp 50.000,00",
                "Mineral Water"
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.hero1)
        recyclerView.layoutManager= LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = DrinkAdapter(this, menuDrinkList){

        }
    }
}