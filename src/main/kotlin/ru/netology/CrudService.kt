package ru.netology.ru.netology

import ru.netology.Comment
import ru.netology.CommentsDelete

interface CrudService<T> {
    fun create(item: T): T
    fun getAll(): List<T>
    fun edit(item: T): Boolean
    fun delete(item: T)
    fun  add(item: T):T
    fun editComment(item:T):Boolean
    fun deleteComment(item: T): Boolean
    fun createComment(item: T): T
    fun getComment():List<T>
    fun restoreComment(item:T): Boolean
}