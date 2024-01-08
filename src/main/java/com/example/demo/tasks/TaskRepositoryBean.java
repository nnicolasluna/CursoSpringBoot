package com.example.demo.tasks;

import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;

@Component
public class TaskRepositoryBean implements TaskRepository{

    @Override
    public Collection<Task> findAll(){
        return Collections.singleton(new Task());
    }

    @Override
    public Task save(Task task) {

        return task;
    }


}
