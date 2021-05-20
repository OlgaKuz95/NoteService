package ru.netology

data class editComment(
    override val type: String,
    val commentId: Int,
    val ownerId: Int,
    val message: String,
) : NoteService
