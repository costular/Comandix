package com.example.commons

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.fragment_list.view.*

abstract class BaseListFragment : BaseFragment() {

    lateinit var listAdapter : RecyclerView.Adapter<*>

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Siempre y cuando la vista y la lista no sean nulas indicamos el adaptador y el layoutManager
        view?.list?.let {
            setupList(view.list)
        }
    }

    override fun getLayoutRes(): Int {
        return R.layout.fragment_list
    }

    open fun setupList(list: RecyclerView){
        listAdapter = getAdapter()

        with(list){
            layoutManager = LinearLayoutManager(context)
            adapter = listAdapter
        }
    }


    abstract fun getAdapter(): RecyclerView.Adapter<*>

}