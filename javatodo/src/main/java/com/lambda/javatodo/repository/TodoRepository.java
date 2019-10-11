package com.lambda.javatodo.repository;

import com.lambda.javatodo.model.Users;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface TodoRepository
{
    @Query(value = "SELECT u.username, t.description FROM users u LEFT JOIN todo t ON u.userid=t.userid WHERE u.userid=:userid", nativeQuery = true)
    Users getUserInfo(long userid);

}
