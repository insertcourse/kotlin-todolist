package com.insert.todolist.todo

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.time.LocalDateTime

@Service
@Transactional
class TodoService(
    private val todoRepository: TodoRepository
) {
    fun save(todo: Todo) {
        todoRepository.save(todo)
    }

    fun getAll(): List<Todo> {
        return todoRepository.findAll()
            .sortedWith(compareBy({ it.finishedAt }, { it.targetDate }))
    }

    fun update(id: Long, todo: Todo) {
        val updatableTodo = todoRepository.findById(id)
            .orElseThrow { RuntimeException("id가 " + id + "인 Todo가 없습니다.") }

        updatableTodo.update(todo)
    }

    fun updateDone(id: Long, finishedAt: LocalDateTime) {
        val updatableTodo = todoRepository.findById(id)
            .orElseThrow { RuntimeException("id가 " + id + "인 Todo가 없습니다.") }

        updatableTodo.updateFinishedTime(finishedAt)
    }
}