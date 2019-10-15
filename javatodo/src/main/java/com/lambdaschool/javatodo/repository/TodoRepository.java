package com.lambdaschool.javatodo.repository;

import com.lambdaschool.javatodo.models.Role;
import com.lambdaschool.javatodo.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long>
{
}
