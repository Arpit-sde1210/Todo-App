package com.todo.application.repository;

import com.todo.application.entity.taskTodo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface todoRepository extends JpaRepository <taskTodo, Long> {

}
