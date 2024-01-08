package com.example.demo.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TaskServiceBean implements TaskService {
    @Autowired
    private TaskMapper mapper;
    @Autowired
    private TaskRepository taskRepository;
    public List<TaskDTO> getAll(){
        return taskRepository
                .findAll()
                .stream()
                .map(task -> mapper.toDTO(task))
                .collect(Collectors.toList());
    }
    @Override
    public TaskDTO create(TaskDTO dto){
        Task task = mapper.toModel(dto);
        Task saveTask = taskRepository.save(task);
        return mapper.toDTO(saveTask);
    }
}
