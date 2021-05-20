package ru.netology

data class Delete(
    override val type: String,
    val noteId: Int,
) : NoteService
