package ru.netology

import ru.netology.ru.netology.noteAccessToTheCommentException
import ru.netology.ru.netology.noteIdNotFoundException


object NoteService {
    val notes = mutableListOf<Note>()
    val comments = mutableListOf<Comment>()
    var noteId = 0
    var commentId = 0

    fun createComment(comment: Comment) {
        comments += comment
        if (notes.any { noteId >= 0 }) {
            println("${comments.add(commentId)}")
        } else (throw noteIdNotFoundException("0"))
    }

    fun add(note: Note): Note {
        notes += note.copy(noteId = noteId++)
        return notes.last()
    }

    //fun read(comment: Comment) {}

    fun delete(note: Note) {
        notes += note
        ("notes.any { noteId >=0 } is  ${notes.any { noteId >= 0 }}")
        println("1")
        ("notes.any { noteId>=0}  !is  ${notes.any { noteId >= 0 }}")
        (throw noteIdNotFoundException("0"))
    }

    fun deleteComment(comment: Comment) {
        comments += comment
        ("commentId.any { commentId >=0 } is  ${comments.any { commentId >= 0 }}")
        println("01")
        ("commentId.any { commentId>=0}  !is  ${notes.any { commentId >= 0 }}")
        (throw noteAccessToTheCommentException("02"))
    }

    fun edit(note: Note): Boolean {
        notes += note
        ("notes.any { noteId >=0 } is  ${notes.any { noteId >= 0 }}")
        println(note.copy())
        ("notes.any { noteId>=0}  !is  ${notes.any { noteId >= 0 }}")
        return false
    }

    fun editComment(comment: Comment): Boolean {
        comments += comment
        println("commentId.any { commentId >=0 } is  ${comments.any { commentId >= 0 }}")
        true
        println("commentId.any { commentId>=0}  !is  ${notes.any { commentId >= 0 }}")
        return false
    }


    val note = Note(
        1,
        "text",
        "te",
        "all",
        "all",
        1,
        2,
        1,
        3,
        1,
        1,
    )
    val comment = Comment(
        1,
        1,
        "t",
        1,
        1,
        0,
        1,
        2,
        1,
    )



private fun <T> MutableList<T>.add(element: Int) {}
}





