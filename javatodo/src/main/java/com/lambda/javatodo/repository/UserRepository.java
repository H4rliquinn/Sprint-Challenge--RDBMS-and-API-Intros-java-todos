package com.lambda.javatodo.repository;

import com.lambda.javatodo.model.Users;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<Users, Long>
{
    Users findByUsername(String username);

    List<Users> findByUsernameContainingIgnoreCase(String name);
}
