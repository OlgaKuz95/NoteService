package ru.netology.ru.netology


interface CrudService<T> {
    fun create(item: T): T
    fun getAll(): List<T>
    fun edit(item: T): Boolean
    fun delete(item: T)
    fun add(item: T): T
}