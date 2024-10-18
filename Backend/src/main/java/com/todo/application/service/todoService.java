package com.todo.application.service;

import com.todo.application.dto.taskDTO;

import java.util.List;

public interface todoService {
    taskDTO createTask(taskDTO taskdto);

    taskDTO getTaskById(Long id);

    List<taskDTO> getAllTask();

    taskDTO updateTask(Long id, taskDTO updateTask);

    void deleteTask(Long id);
}
