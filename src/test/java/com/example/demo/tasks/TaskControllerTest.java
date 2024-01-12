package com.example.demo.tasks;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class TaskControllerTest {

    @InjectMocks
    private TaskControllerTest taskControllerTest;

    @Mock
    private TaskService taskService;

    @Test
    public  void testGetAll(){
        List<TaskDTO> mockTaskList = Arrays.asList(
                //new TaskDTO("New Task1", "description", "category", "Status"),
                //new TaskDTO("New Task1", "description", "category","Status")
        );

        Mockito.when(taskService.getAll()).thenReturn(mockTaskList);


    }
}
