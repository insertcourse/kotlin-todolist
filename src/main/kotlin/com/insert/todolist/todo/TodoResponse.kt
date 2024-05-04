package com.insert.todolist.todo

import java.time.LocalDate
import java.time.LocalDateTime

class TodoResponse(
    val id: Long?,
    val title: String,
    val description: String,
    val targetDateTime: LocalDate,
    val finishedAt: LocalDateTime?
) {

    constructor(todo: Todo) : this(
        todo.id,
        todo.title,
        todo.description,
        todo.targetDate,
        todo.finishedAt
    )

}
