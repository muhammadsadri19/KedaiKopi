package com.muhammadsadri.kedaikopi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DrinkAdapter(private val context: Context, private val menuDrink: List<MenuDrink>, val listener :(MenuDrink)->Unit):
        RecyclerView.Adapter<DrinkAdapter.MenuDrinkHolder>(){

    class MenuDrinkHolder(view: View): RecyclerView.ViewHolder(view) {
        val imgDrink = view.findViewById<ImageView>(R.id.imgFood)
        val titleDrink = view.findViewById<TextView>(R.id.tvTitle)
        val harga = view.findViewById<TextView>(R.id.tvHarga)

        fun bindView(menuDrink: MenuDrink, listener: (MenuDrink) -> Unit){
            imgDrink.setImageResource(menuDrink.imgDrink)
            titleDrink.text = menuDrink.titleFood
            harga.text =menuDrink.harga
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuDrinkHolder {
        return MenuDrinkHolder(
            LayoutInflater.from(context).inflate(R.layout.item_makanan,parent, false)
        )
    }

    override fun onBindViewHolder(holder: MenuDrinkHolder, position: Int) {
        holder.bindView(menuDrink[position], listener)
    }

    override fun getItemCount(): Int = menuDrink.size

}
