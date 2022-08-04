package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.TodoItem;

public interface TodoItemRepository extends CrudRepository<TodoItem,Long> {
    
}
