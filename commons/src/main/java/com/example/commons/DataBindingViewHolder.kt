package com.example.commons

import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView

//ViewHolder genérico que recibe un modelo y el binding.
// A través del binding accdemos a la vista raíz
open class DataBindingViewHolder<MODEL>(val bindingVarId: Int, val binding:  ViewDataBinding) : RecyclerView.ViewHolder(binding.root){

    open fun bindItem(item: MODEL){
        binding.setVariable(bindingVarId, item)

        //Forzar para que le binding se haga automáticamente y en el mismo momento
        binding.executePendingBindings()
    }

}