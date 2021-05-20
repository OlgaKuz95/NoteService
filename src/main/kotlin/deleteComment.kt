package ru.netology

data class deleteComment(
    override val type: String,
    val commentId:Int,
    val ownerId:Int,
):NoteService