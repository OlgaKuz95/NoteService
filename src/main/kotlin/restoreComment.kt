package ru.netology

data class restoreComment (
    override val type: String,
    val commentId:Int,
    val ownerId:Int,
    ):NoteService