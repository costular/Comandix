package com.example.a630465.comandix.fragments

import android.support.v7.widget.RecyclerView
import com.example.a630465.comandix.BR
import com.example.a630465.comandix.R
import com.example.domain.model.*
import com.example.commons.BaseListFragment
import com.example.commons.DataBindingRecyclerAdapter


class DishesFragment : BaseListFragment() {

    override fun getAdapter(): RecyclerView.Adapter<*> {
        val dishAdapter = DataBindingRecyclerAdapter<Dish>(BR.dish, R.layout.item_dish)
        dishAdapter.items.addAll(getDishes())
        dishAdapter.notifyDataSetChanged()
        return dishAdapter
    }

    fun getDishes() : ArrayList<Dish> {

        arrayListOf<Allergen>(Allergen("1","Soja", "https://icon-icons.com/icons2/852/PNG/512/Soy_icon-icons.com_67593.png"))

        return arrayListOf(Dish("1",
                                "Solomillo a la pimienta",
                                "Solomillo de ternera",
                                "https://ep01.epimg.net/elcomidista/imagenes/2017/03/28/receta/1490731468_626097_1490731646_media_normal.jpg",
                                12.50f,
                                arrayListOf<Allergen>(Allergen("1","Soja", "https://icon-icons.com/icons2/852/PNG/512/Soy_icon-icons.com_67593.png"))))
    }

    fun addDIsh(order: Order){

    }

}