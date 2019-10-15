package com.lambdaschool.javatodo.services;

import com.lambdaschool.javatodo.models.Todo;
import com.lambdaschool.javatodo.models.User;
import com.lambdaschool.javatodo.repository.TodoRepository;
import com.lambdaschool.javatodo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service(value = "todoService")
public class TodoServiceImpl  implements TodoService
{
    @Autowired
    private TodoRepository todorepos;
    @Autowired
    private UserRepository userrepos;

    @Override
    public void save(Todo todo)
    {
        todorepos.save(todo);
    }

    @Override
    public void updateTodo(Todo newTodo, long todoid)
    {
        Todo todo=todorepos.findById(todoid).orElseThrow(()->new EntityNotFoundException(Long.toString(todoid)));
        todo.setCompleted(newTodo.isCompleted());
        todorepos.save(todo);
    }
}
