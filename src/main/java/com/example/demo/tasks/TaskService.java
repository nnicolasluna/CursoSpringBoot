package com.example.demo.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


public interface TaskService {

    public List<TaskDTO> getAll();

    TaskDTO create(TaskDTO dto);
}
