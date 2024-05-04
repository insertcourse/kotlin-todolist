package com.insert.todolist.todo

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDate
import java.time.LocalDateTime

@Entity
class Todo(
    var title: String,
    var description: String,
    var targetDate: LocalDate
) : BaseEntity() {
    var finishedAt: LocalDateTime? = null

    fun update(todo: Todo) {
        this.title = todo.title
        this.description = todo.description
        this.targetDate = todo.targetDate
    }

    fun updateFinishedTime(finishedAt: LocalDateTime) {
        this.finishedAt = finishedAt
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
}