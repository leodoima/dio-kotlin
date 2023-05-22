package models

import models.enums.Level
import config.ExceptionHandler

data class Training(val name: String, val contents: Set<EducationalContent>, val level: Level){

    private val subscribed =  mutableSetOf<User>()
    private val exceptionHandler = ExceptionHandler()

    fun enroll(user: User) {
        if(isSubscribed(user)){
            exceptionHandler.fail("models.User already subscribed in this class")
        }
        subscribed.add(user);
    }

    private fun isSubscribed(user: User) : Boolean{
        return subscribed.contains(user)
    }
}
