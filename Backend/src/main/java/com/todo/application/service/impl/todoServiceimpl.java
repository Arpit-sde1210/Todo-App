package com.todo.application.service.impl;

import com.todo.application.dto.taskDTO;
import com.todo.application.entity.taskTodo;
import com.todo.application.exception.notFoundException;
import com.todo.application.mapper.taskMapper;
import com.todo.application.repository.todoRepository;
import com.todo.application.service.todoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class todoServiceimpl implements todoService {

    private todoRepository todorepository;

    @Override
    public taskDTO createTask(taskDTO taskdto) {
        taskTodo tasktodo = taskMapper.mapTotaskTodo(taskdto);
        taskTodo savedTask = todorepository.save(tasktodo);
        return taskMapper.mapTotaskDTO(savedTask);
    }

    @Override
    public taskDTO getTaskById(Long id) {
        taskTodo todo = todorepository.findById(id)
                .orElseThrow(() -> new notFoundException("Task Does not Exist at the moment"));
        return taskMapper.mapTotaskDTO(todo);
    }

    @Override
    public List<taskDTO> getAllTask() {
        List<taskTodo> tasktodo = todorepository.findAll();
        return tasktodo.stream().map(taskMapper::mapTotaskDTO).collect(Collectors.toList());
    }

    @Override
    public taskDTO updateTask(Long id, taskDTO updateTask) {
        taskTodo task = todorepository.findById(id).orElseThrow(
                () -> new notFoundException("Task Does not exist")
        );

        task.setTask(updateTask.getTask());
        task.setCompleted(updateTask.isCompleted());

        taskTodo updateTaskObj = todorepository.save(task);
        return taskMapper.mapTotaskDTO(updateTaskObj);
    }

    @Override
    public void deleteTask(Long id) {
        taskTodo task = todorepository.findById(id).orElseThrow(
                () -> new notFoundException("Task Does not exist")
        );

        todorepository.deleteById(id);
    }
}
