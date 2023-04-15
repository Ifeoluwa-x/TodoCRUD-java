package com.example.TodoCrud.service;

import com.example.TodoCrud.bean.Subject;
import com.example.TodoCrud.repository.TodoRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TodoService {
    @Autowired
    public TodoRepository todorepo;
    public List<Subject> getAllTasks() {
        List<Subject> subjects = new ArrayList<>();
        todorepo.findAll().forEach(subjects::add);
            return subjects;
    }

    public void addTask(@NotNull Subject subject) {
        Optional<Subject> existingSubject = todorepo.findById(subject.getId());

        // If the subject already exists, you can choose to update it or throw an exception
        if (existingSubject.isPresent()) {
            throw new RuntimeException("Subject with id " + subject.getId() + " already exists in the database");
        }else {
            todorepo.save(subject);
        }
    }

    public void updateTask(String id, Subject subject) {
        todorepo.save(subject);
    }


    public void deleteTask(String id) {
        todorepo.deleteById(id);
    }
}