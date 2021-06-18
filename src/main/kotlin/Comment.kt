package ru.netology

data class Comment<T>(
    val commentId: T,
    val ownerId: T,
    val message: T,
    val noteId: T,
    val guid: T,
    val replyTo: T,
    val sort: T,
    val offset: T,
    val count: T,

    )

