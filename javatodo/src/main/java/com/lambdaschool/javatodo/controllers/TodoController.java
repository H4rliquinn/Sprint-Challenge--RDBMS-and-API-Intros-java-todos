package com.lambdaschool.javatodo.controllers;

import com.lambdaschool.javatodo.models.Todo;
import com.lambdaschool.javatodo.models.User;
import com.lambdaschool.javatodo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/todos")
public class TodoController
{
    @Autowired
    private TodoService todoService;
//    PUT /todos/todoid/{todoid}
    @PutMapping(value = "/todoid/{todoid}",
            consumes = {"application/json"})
    public ResponseEntity<?> completeTodo(@RequestBody Todo newTodo, @PathVariable long todoid)
    {
        todoService.updateTodo(newTodo,todoid);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
