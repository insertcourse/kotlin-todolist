package com.insert.todolist.todo

import java.time.LocalDate

data class TodoRequest(
    val title: String,
    val description: String,
    val targetDateTime: LocalDate,
) {
    fun toEntity(): Todo {
        return Todo(title, description, targetDateTime)
    }
}
