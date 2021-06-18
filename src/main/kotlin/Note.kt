package ru.netology

data class Note<T>(
    val noteId: T,
    val title: T,
    val text: T,
    val privacyView: T,
    val privacyComment: T,
    val userId: T,
    val offset: T,
    val count: T,
    val sort: T,
    val needWiki: T,
    val noteIds: T,

)