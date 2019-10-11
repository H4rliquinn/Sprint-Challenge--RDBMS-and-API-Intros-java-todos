package com.lambda.javatodo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.h2.engine.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "todo")
public class Todo extends Auditable
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long todoid;

    @Column(nullable = false, unique = true)
    private String description;

    Date datestarted;
    boolean completed;

    @ManyToOne
    @JoinColumn(name = "userid",
            nullable = false)
    private Users user;

    public Todo()
    {
    }

    public Todo(String description, Date datestarted, Users user)
    {
        this.description = description;
        this.datestarted = datestarted;
        this.user = user;
        this.completed=false;
    }

    public long getTodoid()
    {
        return todoid;
    }

    public void setTodoid(long todoid)
    {
        this.todoid = todoid;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Date getdatestarted()
    {
        return datestarted;
    }

    public void setdatestarted(Date datestarted)
    {
        this.datestarted = datestarted;
    }

    public boolean isCompleted()
    {
        return completed;
    }

    public void setCompleted(boolean completed)
    {
        this.completed = completed;
    }

    public Users getUser()
    {
        return user;
    }

    public void setUser(Users user)
    {
        this.user = user;
    }


}
