package com.example.domain.model

data class Dish (val id: String,
                 val name: String,
                 val details: String,
                 val img: String,
                 val price: Float,
                 val allergens: List<Allergen>){




}