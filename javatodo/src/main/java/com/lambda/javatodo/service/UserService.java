package com.lambda.javatodo.service;

import com.lambda.javatodo.model.Users;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public interface UserService
{
    UserDetails loadUserByUsername(String username);

    List<Users> findAll();

    List<Users> findByNameContaining(String username);

    Users findUserById(long id);

    Users findByName(String name);

    void delete(long id);

    Users save(Users user);

    Users update(Users user,
                long id,
                boolean isAdmin);

    void deleteUserRole(long userid,
                        long roleid);

    void addUserRole(long userid,
                     long roleid);
}