package com.example.commons

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

//Adaptador genérico, recibe un modelo de datos con el que vamos a trabajar,
// que es el mismo que se le pasará al ViewHolder y el mismo modelo que se usará para crear la lista

 class DataBindingRecyclerAdapter <MODEL>(val bindingVarId: Int, val viewHolderResId: Int) : RecyclerView.Adapter<DataBindingViewHolder<MODEL>>() {

    var items : MutableList<MODEL> = mutableListOf()

    //Saber cuántos item va a tener
    override fun getItemCount(): Int = items.size

    //Crear la vista de los items, para ello usa el id del layout especificado cuando lo llamamos
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataBindingViewHolder<MODEL> {
        val binding : ViewDataBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context),
                                                                                    viewHolderResId,
                                                                                    parent,
                                                                                    false)

        return DataBindingViewHolder(bindingVarId, binding)
    }

     //Configura el contenido de la view con el item obtenido en la posición especificada
    override fun onBindViewHolder(holder: DataBindingViewHolder<MODEL>, position: Int) {
        val item = items[position]
        holder.bindItem(item)
    }

     //Añade todos los items y notifica el cambio
     fun updateItems(tables: ArrayList<MODEL>) {
         items.addAll(tables)
         notifyDataSetChanged()
     }


 }