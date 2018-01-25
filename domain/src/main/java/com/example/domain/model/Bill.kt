package com.example.domain.model


data class Bill(val id: String,
                val total: Float,
                val table: Int,
                val dishes: List<Dish>){

}