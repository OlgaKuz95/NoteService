package ru.netology

data class getById(
    override val type: String,
    val noteId: Int,
    val ownerId: Int,
    val needWiki: Int,
) : NoteService