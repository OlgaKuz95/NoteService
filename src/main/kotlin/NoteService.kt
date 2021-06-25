package ru.netology

import ru.netology.ru.netology.CrudService
import ru.netology.ru.netology.noteAccessToTheCommentException
import ru.netology.ru.netology.noteIdNotFoundException


abstract class NoteService : CrudService<Note> {
    private val notes = mutableListOf<Note>()
    private var noteId = 0


    override fun getAll(): List<Note> = notes

    override fun  add(item: Note): Note {
        notes += item.copy(noteId = noteId++)
        return notes.last()
    }


  /* override fun  delete(item: Note) {
        //notes += note
        ("notes.any { noteId >=0 } is  ${notes.any { noteId >= 0 }}")
        println("1")
        ("notes.any { noteId>=0}  !is  ${notes.any { noteId >= 0 }}")
        (throw noteIdNotFoundException("0"))
    }*/
    override fun delete(item: Note) {
        notes.remove(item)
    }



    override fun edit(item: Note): Boolean =
        notes.indexOfFirst { it.noteId == item.noteId }
            .takeIf { it >= 0 }
            ?.let {
                notes[it] = item
                true
            } ?: false


    override fun create(item: Note): Note {
        notes += item.copy(noteId = noteId++)
        return notes.last()
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
}





