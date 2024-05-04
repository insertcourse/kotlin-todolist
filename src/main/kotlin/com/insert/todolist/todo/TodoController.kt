package com.insert.todolist.todo

import org.springframework.http.HttpStatus.*
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/todo")
class TodoController(
    private val todoService: TodoService
) {
    @PostMapping
    @ResponseStatus(CREATED)
    fun create(@RequestBody todoRequest: TodoRequest) {
        todoService.save(todoRequest.toEntity())
    }

    @GetMapping
    @ResponseStatus(OK)
    fun getAll(): List<TodoResponse> {
        return todoService.getAll()
            .map(::TodoResponse)
    }

    @PatchMapping("/{id}")
    @ResponseStatus(NO_CONTENT)
    fun update(@PathVariable id: Long, @RequestBody todoRequest: TodoRequest) {
        todoService.update(id, todoRequest.toEntity())
    }

    @PatchMapping("/{id}/done")
    @ResponseStatus(NO_CONTENT)
    fun updateDone(@PathVariable id: Long, @RequestBody finishedAtRequest: FinishedAtRequest) {
        todoService.updateDone(id, finishedAtRequest.finishedAt)
    }
}