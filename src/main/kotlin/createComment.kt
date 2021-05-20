package ru.netology

data class createComment(
    override val type: String,
    val noteId: Int,
    val ownerId: Int,
    val replyTo: Int,
    val message: String,
    val guid: Int,
) : NoteService


