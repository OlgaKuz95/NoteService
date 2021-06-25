package ru.netology

import org.junit.Test
import ru.netology.ru.netology.noteIdNotFoundException

class NoteServiceTest {
    val service = NoteService()

    @Test(expected = noteIdNotFoundException::class)
    fun createComment() {
        val createComment = Comment(
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
        service.add(
            Note(
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
        )
        service.createComment(createComment)
    }
}
