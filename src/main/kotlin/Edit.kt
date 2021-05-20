package ru.netology

data class Edit(
    override val type: String,
    val noteId: Int,
    val title: String,
    val text: String,
    val privacyView: String,
    val privacyComment: String,
) : NoteService
