package com.example.TodoCrud.bean;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


// Bean base class
@Entity
//Created a table with the name "Task"
@Table(name = "Task")
public class Subject {
    @Id
    private String id;
    private String task;
    private String status;


    //Default constructor
    public Subject() {

    }


    //Contructors for the getter/setter methods
    public Subject(String id, String task, String status) {
        this.id = id;
        this.task = task;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
