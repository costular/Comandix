package com.example.a630465.comandix.adapters

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.a630465.comandix.BR
import com.example.a630465.comandix.R
import com.example.a630465.comandix.utils.Handlers
import com.example.commons.DataBindingRecyclerAdapter
import com.example.commons.DataBindingViewHolder
import com.example.domain.model.Table

/**
 * Created by diego.francisco on 25/01/2018.
 */
class TableAdapter(private val presenter: Handlers) : DataBindingRecyclerAdapter<Table>(BR.table, R.layout.item_table) {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): DataBindingViewHolder<Table> {
        val viewDatabinding: ViewDataBinding = DataBindingUtil.inflate(LayoutInflater.from(parent!!.context), R.layout.item_table, parent, false)
        return TableViewHolder(viewDatabinding, presenter)
    }

}