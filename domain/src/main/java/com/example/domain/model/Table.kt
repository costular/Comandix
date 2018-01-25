package com.example.domain.model

data class Table(var idTable: String, var number: String) {

    init {
        Tables(ArrayList<Table>())
    }
}

data class Tables(val tables: MutableList<Table>): Aggregate<Table> {

    override fun count(): Int = tables.size

    override fun all(): List<Table> = tables

    override fun get(position: Int): Table {
        return tables.get(position)
    }

    override fun add(element: Table) {
        tables.add(element)
    }
}