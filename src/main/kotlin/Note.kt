package ru.netology

data class Note(
    val noteId:Int,
    val title: String,
    val text: String,
    val privacyView: String,
    val privacyComment: String,
    val userId: Int,
    val offset: Int,
    val count: Int,
    val sort:Int ,
    val needWiki:Int ,
    val noteIds: Int,

)