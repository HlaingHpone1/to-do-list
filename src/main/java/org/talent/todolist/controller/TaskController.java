package org.talent.todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.talent.todolist.domain.HttpResponse;
import org.talent.todolist.dto.NewTaskRequest;
import org.talent.todolist.entity.Task;
import org.talent.todolist.service.TaskService;

import java.util.List;

@RestController
@CrossOrigin
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/tasks")
    public ResponseEntity<List<Task>> getAllTask(){
        List<Task> taskList = taskService.findAll();

        return new ResponseEntity<>(taskList, HttpStatus.OK);
    }

    @PostMapping("/tasks")
    public ResponseEntity<HttpResponse> saveTask(@RequestBody NewTaskRequest request){
        Task task = taskService.createTask(request);
        HttpResponse httpResponse = new HttpResponse(task, HttpStatus.CREATED);

        return new ResponseEntity<>(httpResponse, HttpStatus.CREATED);
    }

    @DeleteMapping("/tasks/{id}")
    public ResponseEntity<String> deleteTask(@PathVariable Long id){
        taskService.delete(id);

        return new ResponseEntity<>("Success Delete", HttpStatus.NO_CONTENT);
    }

}
