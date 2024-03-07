package org.talent.todolist.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.talent.todolist.dao.TaskDao;
import org.talent.todolist.dto.NewTaskRequest;
import org.talent.todolist.entity.Task;
import org.talent.todolist.service.TaskService;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskDao taskDao;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void delete(Long id) {
        if (taskDao.existsById(id)){
            taskDao.deleteById(id);
        }
    }

    @Override
    public Task findById(Long id) {
        Task task = null;
        if (taskDao.existsById(id)){
            task = taskDao.findById(id).orElse(null);
        }
        return task;
    }

    @Override
    public Task createTask(NewTaskRequest request) {
//        Task task = Task.builder()
//                .label(request.getLabel())
//                .startTime(request.getStartTime())
//                .endTime(request.getEndTime())
//                .repeateType(request.getRepeateType())
//                .category(request.getCategory())
//                .build();

        System.out.println(request.getRepeateType());
        System.out.println(request.getCategory());

        Task task = mapper.map(request, Task.class);
        return taskDao.save(task);
    }

    @Override
    public List<Task> findAll() {
        return taskDao.findAll();
    }


}
