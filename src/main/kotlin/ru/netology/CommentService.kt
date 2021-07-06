package ru.netology

import ru.netology.Comment
import ru.netology.ru.netology.CrudService
import ru.netology.Note


abstract class CommentService : CrudService<Comment> {
    private val comments = mutableListOf<Comment>()
    private val commentsDeletes = mutableListOf<Comment>()

    private var commentId = 0


    override fun edit(item: Comment): Boolean =
        comments.indexOfFirst { it.commentId == item.commentId }
            .takeIf { it >= 0 }
            ?.let {
                comments[it] = item
                true
            } ?: false


    override fun delete(item: Comment) {
        commentsDeletes.add(item)
        comments.remove(item)
    }

    fun restoreComment(comment: Comment): Boolean {
        commentsDeletes.remove(comment)
        return comments.add(comment)}


    override fun create(item: Comment): Comment {
            comments += item.copy(commentId = commentId++)
            return comments.last()
        }


    override fun getAll(): List<Comment> = comments


        val comment = mutableListOf(
            Comment(
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
        )


    }









