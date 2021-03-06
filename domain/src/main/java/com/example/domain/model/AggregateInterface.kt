package com.example.domain.model

// Interface segregation

interface ReadAggregate<T> {
    fun count(): Int
    fun all(): List<T>
    fun get(position: Int): T
}

interface WriteAggregate<T> {
    fun add(element: T)
}

interface Aggregate<T>: ReadAggregate<T>, WriteAggregate<T>