package ru.netology

data class Get(
    override val type: String,
    val noteIds: Int,
    val userId: Int,
    val offset: Int,
    val count: Int,
    val sort: Int,
) : NoteService
