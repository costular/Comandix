package com.example.domain.model

data class Order(val id: String,
                 val extra: String,
                 val quantity: Int,
                 val billId: String,
                 val dishId: String,
                 val nameDish: String,
                 val detailsDish: String,
                 val imageDish: String,
                 val priceDish: Float){

    fun calculatePriceTotalDish() = (quantity * priceDish).toString()
}


