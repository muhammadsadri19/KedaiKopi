package com.muhammadsadri.kedaikopi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class FoodAdapter (private val context: Context, private val menuFood: List<MenuFood>, val listener :(MenuFood)-> Unit):
    RecyclerView.Adapter<FoodAdapter.MenuFoodHolder>() {

    class MenuFoodHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgFood = view.findViewById<ImageView>(R.id.imgFood)
        val titleFood = view.findViewById<TextView>(R.id.tvTitle)
        val harga = view.findViewById<TextView>(R.id.tvHarga)

        fun bindView(menuFood: MenuFood, listener: (MenuFood) -> Unit){
            imgFood.setImageResource(menuFood.imgFood)
            titleFood.text = menuFood.titleFood
            harga.text = menuFood.harga
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuFoodHolder {
        return MenuFoodHolder(
            LayoutInflater.from(context).inflate(R.layout.item_makanan, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MenuFoodHolder, position: Int) {
        holder.bindView(menuFood[position], listener)
    }

    override fun getItemCount(): Int = menuFood.size
    }
