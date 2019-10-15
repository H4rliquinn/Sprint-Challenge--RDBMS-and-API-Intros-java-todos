package com.lambdaschool.javatodo.services;

import com.lambdaschool.javatodo.models.Todo;

public interface TodoService
{
    void save(Todo todo);

    void updateTodo(Todo newTodo, long todoid);

}
