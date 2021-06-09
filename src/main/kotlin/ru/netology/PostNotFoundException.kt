package ru.netology.ru.netology

class PostNotFoundException : Throwable() {

}
class noteIdNotFoundException (message:String): RuntimeException(message){

}
class noteAccessToTheCommentException(message:String): RuntimeException(message){

}
