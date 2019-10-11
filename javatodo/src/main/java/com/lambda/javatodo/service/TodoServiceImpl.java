package com.lambda.javatodo.service;

import com.lambda.javatodo.model.Todo;
import com.lambda.javatodo.model.Users;
import com.lambda.javatodo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service(value = "todoService")
public class TodoServiceImpl implements TodoService
{
    @Autowired
    private TodoRepository todoRepo;

    @Override
    public Users getUserInfo(long id)
    {
        return null todorepo.getUserInfo();
    }

    @Override
    public void addUser()
    {

    }

    @Override
    public void addTodo()
    {

    }

    @Override
    public void updateTodo(long id)
    {

    }

    @Override
    public void deleteUser()
    {

    }
}
