package org.talent.todolist.service;

import org.talent.todolist.dto.NewTaskRequest;
import org.talent.todolist.entity.Task;

import java.util.List;

public interface TaskService {

    Task createTask(NewTaskRequest request);

    List<Task> findAll();

    void delete(Long id);

    Task findById(Long id);

}
