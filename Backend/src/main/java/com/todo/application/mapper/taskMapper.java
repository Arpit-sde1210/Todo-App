package com.todo.application.mapper;

import com.todo.application.dto.taskDTO;
import com.todo.application.entity.taskTodo;

public class taskMapper {

    // Method to map taskTodo entity to taskDTO
    public static taskDTO mapTotaskDTO(taskTodo task) {
        return new taskDTO(
                task.getId(),        // Maps the task description
                task.getTask(),          // Maps the task ID
                task.isCompleted()     // Maps the completion status
        );
    }

    public static taskTodo mapTotaskTodo(taskDTO taskdto) {
        return new taskTodo(
            taskdto.getId(),
            taskdto.getTask(),
            taskdto.isCompleted()
        );
    }

}
