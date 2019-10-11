package com.lambda.javatodo.controller;

import com.lambda.javatodo.model.Role;
import com.lambda.javatodo.model.Users;
import com.lambda.javatodo.service.RoleService;
import com.lambda.javatodo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController
{
    @Autowired
    TodoService todoService;

    //GET /users/mine - return the user and todo based off of the authenticated user.
    // You can only look up your own. It is okay if this also lists the users roles and authorities.

    @GetMapping(value = "/users/mine",
            produces = {"application/json"})
    public ResponseEntity<?> getUserInfo()
    {
        Users userInfo = todoService.getUserInfo(4);
        return new ResponseEntity<>(userInfo,
                HttpStatus.OK);
    }


    //POST /users/user - adds a user. Can only be done by an admin

    //POST /users/todo/{userid} - adds a todo to the assigned user. Can be done by any user. You can add this todo

    //PUT /todos/todoid/{todoid} - updates a todo based on todoid. Can be done by any user.
    // Note: null boolean is not a thing - it is false, so just set compeleted to whatever comes across in the RequestBody.

    //DELETE /users/userid/{userid} - Deletes a user based off of their userid and deletes all their associated todos.
    // Can only be done by an admin.

}
