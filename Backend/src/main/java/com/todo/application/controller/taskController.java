package com.todo.application.controller;


import com.todo.application.dto.taskDTO;
import com.todo.application.service.todoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/tasks")

public class taskController {

    private todoService todoservice;

    //Build Add Task Rest API
    @PostMapping
    public ResponseEntity<taskDTO> createTask(@RequestBody taskDTO taskdto){
    taskDTO savedTask = todoservice.createTask(taskdto);
    return new ResponseEntity<>(savedTask, HttpStatus.CREATED);
    }

    //Build Get Task Rest API
    @GetMapping("{ID}")
    public ResponseEntity<taskDTO> GettaskById(@PathVariable("ID") Long id){
      taskDTO taskdto =  todoservice.getTaskById(id);
      return ResponseEntity.ok(taskdto);
    }
    //Build Get All Task Rest API
    @GetMapping
    public ResponseEntity<List<taskDTO>> getAllTask () {
       List<taskDTO> tasks = todoservice.getAllTask();
       return ResponseEntity.ok(tasks);
    }
    //Build Update Task Rest API
    @PutMapping("{ID}")
    public ResponseEntity<taskDTO> updateTask(@PathVariable("ID") Long id, @RequestBody taskDTO updatedTask) {
        taskDTO taskdto = todoservice.updateTask(id, updatedTask);
        if (taskdto == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(taskdto);
    }

    //Build Delete Task Rest API
    @DeleteMapping("{ID}")
    public ResponseEntity<String> deleteTask (@PathVariable("ID") Long id) {
        todoservice.deleteTask(id);
        return ResponseEntity.ok("Task Deleted");
    }

}
