package com.lambda.javatodo.service;

import com.lambda.javatodo.model.Users;

public interface TodoService
{
    Users getUserInfo(long id);

    void addUser();

    void addTodo();

    void updateTodo(long id);

    void deleteUser();

}
