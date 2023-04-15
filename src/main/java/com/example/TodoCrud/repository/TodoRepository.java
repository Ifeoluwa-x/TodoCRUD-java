package com.example.TodoCrud.repository;
import com.example.TodoCrud.bean.Subject;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Subject,String> {
}
