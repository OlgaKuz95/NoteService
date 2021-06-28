package ru.netology.ru.netology

import ru.netology.Comment


abstract class CommentService : CrudService<Comment> {
    private val comments = mutableListOf<Comment>()
    private val commentsDeletes = mutableListOf<Comment>()

    private var commentId = 0

    /*override fun  editComment(item: Comment): Boolean {
        comments += comment
        println("commentId.any { commentId >=0 } is  ${comments.any { commentId >= 0 }}")
        true
        println("commentId.any { commentId>=0}  !is  ${comments.any { commentId >= 0 }}")
        return false}*/

    override fun editComment(item: Comment): Boolean =
        comments.indexOfFirst { it.commentId == item.commentId }
            .takeIf { it >= 0 }
            ?.let {
                comments[it] = item
                true
            } ?: false


    override fun deleteComment(item: Comment): Boolean {
        commentsDeletes.add(item)
        return comments.remove(item)
    }

    override fun restoreComment(item: Comment): Boolean {
         commentsDeletes.last()
        return comments.add(item)
    }


    override fun createComment(item: Comment): Comment {
        comments += item.copy(commentId = commentId++)
        return comments.last()
    }

    override fun getComment(): List<Comment> = comments


    private val comment = mutableListOf(
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









