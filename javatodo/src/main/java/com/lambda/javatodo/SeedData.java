package com.lambda.javatodo;

import com.lambda.javatodo.model.*;
import com.lambda.javatodo.service.RoleService;
import com.lambda.javatodo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

@Transactional
@Component
public class SeedData implements CommandLineRunner
{
    @Autowired
    RoleService roleService;

    @Autowired
    UserService userService;


    @Override
    public void run(String[] args) throws Exception
    {
        Role r1 = new Role("admin");
        Role r2 = new Role("user");
        Role r3 = new Role("data");

        roleService.save(r1);
        roleService.save(r2);
        roleService.save(r3);

        // admin, data, user
        ArrayList<UserRoles> admins = new ArrayList<>();
        admins.add(new UserRoles(new Users(),
                                 r1));
        admins.add(new UserRoles(new Users(),
                                 r2));
        admins.add(new UserRoles(new Users(),
                                 r3));
        Users u1 = new Users("admin",
                           "password",
                           "admin@lambdaschool.local",
                           admins);

        u1.getTodos().add(new Todo("Finish java-orders-swagger", new Date(), u1));
        u1.getTodos().add(new Todo("Feed the turtles", new Date(), u1));
        u1.getTodos().add(new Todo("Complete the sprint challenge", new Date(), u1));

        userService.save(u1);

        // data, user
        ArrayList<UserRoles> datas = new ArrayList<>();
        datas.add(new UserRoles(new Users(),
                                r3));
        datas.add(new UserRoles(new Users(),
                                r2));
        Users u2 = new Users("cinnamon",
                           "1234567",
                           "cinnamon@lambdaschool.local",
                           datas);

        u2.getTodos().add(new Todo("Walk the dogs", new Date(), u2));
        u2.getTodos().add(new Todo("provide feedback to my instructor", new Date(), u2));
        userService.save(u2);

        // user
        ArrayList<UserRoles> users = new ArrayList<>();
        users.add(new UserRoles(new Users(),
                                r2));
        Users u3 = new Users("barnbarn",
                           "ILuvM4th!",
                           "barnbarn@lambdaschool.local",
                           users);
        userService.save(u3);

        users = new ArrayList<>();
        users.add(new UserRoles(new Users(),
                                r2));
        Users u4 = new Users("puttat",
                           "password",
                           "puttat@school.lambda",
                           users);
        userService.save(u4);

        users = new ArrayList<>();
        users.add(new UserRoles(new Users(),
                                r2));
        Users u5 = new Users("misskitty",
                           "password",
                           "misskitty@school.lambda",
                           users);
        userService.save(u5);
    }
}
