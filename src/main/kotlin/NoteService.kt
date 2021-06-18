package ru.netology

import ru.netology.ru.netology.noteAccessToTheCommentException
import ru.netology.ru.netology.noteIdNotFoundException


class NoteService<T> {
    val notes = mutableListOf<T>()
    var comments = mutableListOf<T>()
    var noteId = 0
    var commentId = 0

    fun <T> createComment(comment: T) {
        comments += comment
        if (notes.any { noteId >= 0 }) {
            println("${сomments.add(commentId)}")
        } else (throw noteIdNotFoundException("0"))
    }

    fun <T> add(note: T): T {
        notes += note.copy(noteId = noteId++)
        return notes.last()
    }

    //fun read(comment: Comment) {}

    fun <T> delete(note: T): T {
        //notes += note
        ("notes.any { noteId >=0 } is  ${notes.any { noteId >= 0 }}")
        println("1")
        ("notes.any { noteId>=0}  !is  ${notes.any { noteId >= 0 }}")
        (throw noteIdNotFoundException("0"))
    }

    fun <T> deleteComment(comment: T) {
        comments += comment
        ("commentId.any { commentId >=0 } is  ${comments.any { commentId >= 0 }}")
        println("01")
        ("commentId.any { commentId>=0}  !is  ${notes.any { commentId >= 0 }}")
        (throw noteAccessToTheCommentException("02"))
    }

    fun <T> edit(note: T): Boolean {
        //notes += note
        ("notes.any { noteId >=0 } is  ${notes.any { noteId >= 0 }}")
        println(note.copy())
        ("notes.any { noteId>=0}  !is  ${notes.any { noteId >= 0 }}")
        return false
    }

    fun <T> editComment(comment: T): Boolean {
        comments += comment
        println("commentId.any { commentId >=0 } is  ${comments.any { commentId >= 0 }}")
        true
        println("commentId.any { commentId>=0}  !is  ${notes.any { commentId >= 0 }}")
        return false
    }


    val note = mutableListOf(Note(
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
    ))

    val comment = mutableListOf (Comment(
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


}





