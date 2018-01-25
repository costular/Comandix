package com.example.a630465.comandix.fragments

import android.support.v7.widget.RecyclerView
import com.example.a630465.comandix.BR
import com.example.a630465.comandix.R
import com.example.domain.model.*
import com.example.commons.BaseListFragment
import com.example.commons.DataBindingRecyclerAdapter


class TableFragment : BaseListFragment() {

    override fun setupList(list: RecyclerView) {
        super.setupList(list)
    }

    override fun getAdapter(): RecyclerView.Adapter<*> {
        val tablesAdapter = DataBindingRecyclerAdapter<Table>(BR.table, R.layout.item_table)
        tablesAdapter.updateItems(getTables())

        return tablesAdapter
    }

    fun getTables() : ArrayList<Table> {
        return arrayListOf(Table("1234", number = "1"),
                            Table("456", "2"),
                            Table("456", "3"),
                            Table("456", "4"),
                            Table("456", "5"),
                            Table("456", "6"),
                            Table("456", "7"),
                            Table("456", "8"),
                            Table("456", "9"))
    }

}
