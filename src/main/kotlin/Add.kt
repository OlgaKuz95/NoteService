package ru.netology


data class Add(
    override val type: String,
    val title: String,
    val text: String,
    val privacyView: String,
    val privacyComment: String,
) : NoteService