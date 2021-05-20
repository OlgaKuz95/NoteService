package ru.netology

data class getComments(
    override val type: String,
    val noteId: Int,
    val ownerId: Int,
    val sort: Int,
    val offset: Int,
    val count: Int,
) : NoteService