package com.example.demo.tasks;

import java.util.Collection;

public interface TaskRepository {

    Collection<Task>findAll();

    Task save(Task task);
}
