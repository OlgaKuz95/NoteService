package ru.netology

data class Comment(
    val commentId: Int,
    val ownerId: Int,
    val message: String,
    val noteId: Int,
    val guid: Int,
    val replyTo: Int,
    val sort: Int,
    val offset: Int,
    val count: Int,

    )



