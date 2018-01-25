package com.example.a630465.comandix.adapters

import android.databinding.ViewDataBinding
import com.example.a630465.comandix.BR
import com.example.a630465.comandix.utils.Handlers
import com.example.commons.DataBindingViewHolder
import com.example.domain.model.Dish
import com.example.domain.model.Table

/**
 * Created by diego.francisco on 25/01/2018.
 */
class DishViewHolder(val viewDataBinding: ViewDataBinding,
                     val presenter: Handlers) : DataBindingViewHolder<Dish>(BR.dish, viewDataBinding) {

    override fun bindItem(item: Dish) {
        super.bindItem(item)
        viewDataBinding.setVariable(BR.presenter, presenter)
    }

}