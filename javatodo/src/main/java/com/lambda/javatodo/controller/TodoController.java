package com.lambda.javatodo.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController
{
    //GET /users/mine - return the user and todo based off of the authenticated user.
    // You can only look up your own. It is okay if this also lists the users roles and authorities.

    //POST /users/user - adds a user. Can only be done by an admin

    //POST /users/todo/{userid} - adds a todo to the assigned user. Can be done by any user. You can add this todo

    //PUT /todos/todoid/{todoid} - updates a todo based on todoid. Can be done by any user.
    // Note: null boolean is not a thing - it is false, so just set compeleted to whatever comes across in the RequestBody.

    //DELETE /users/userid/{userid} - Deletes a user based off of their userid and deletes all their associated todos.
    // Can only be done by an admin.

}
