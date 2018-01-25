package com.example.a630465.comandix.utils

import android.util.Log
import android.view.View
import com.example.domain.model.Table


class Handlers {

    fun showOrderForTable(table: Table){
        println("Dentro")
        Log.i("ME", "Logging...")
    }

    fun showToast(view: View){
        println("Dentro Imagen")
        Log.i("ME", "Logging...")
    }
}

