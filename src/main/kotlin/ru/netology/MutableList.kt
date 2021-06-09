package ru.netology.ru.netology

import ru.netology.Note

interface MutableList<T> : List<T>, MutableCollection<T> {
    override fun add(element: T): Boolean
    override fun remove(element: T): Boolean
    override fun addAll(elements: Collection<T>): Boolean
    public fun addAll(index: Int, elements: Collection<T>): Boolean
    override fun removeAll(elements: Collection<T>): Boolean
    override fun retainAll(elements: Collection<T>): Boolean
    override fun clear(): Unit
    public operator fun set(index: Int, element: T): T
    public fun add(index: Int, element: T): Unit
    public fun remoweAt(index: Int): T
    override fun listIterator(): MutableListIterator<T>
    override fun listIterator(index: Int): MutableListIterator<T>
    override fun subList(fromIndex: Int, toIndex: Int): List<T>
}