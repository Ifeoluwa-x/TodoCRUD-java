package com.example.TodoCrud.controller;

import com.example.TodoCrud.bean.Subject;
import com.example.TodoCrud.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class TodoController {
    @Autowired
    private TodoService todoService;
    @RequestMapping("/tasks")
    public List <Subject> getAllTasks(){
        return todoService.getAllTasks();
    }

    @RequestMapping(method = RequestMethod.POST, value="/tasks")
    public void addTask(@RequestBody Subject subject){
        todoService.addTask(subject);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/tasks/{id}")
    public void updateTask(@PathVariable String id, @RequestBody Subject subject){
        todoService.updateTask(id, subject);
    }


    @RequestMapping(method = RequestMethod.DELETE, value="/tasks/{id}")
    public void deleteTask(@PathVariable String id){
        todoService.deleteTask(id);
    }
}
