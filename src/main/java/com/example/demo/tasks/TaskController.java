package com.example.demo.tasks;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;
    @GetMapping
    public List<TaskDTO> getall(@RequestParam(value = "categororyId", required = false) List<String> categoryIdList){
        return taskService.getAll();
    }
    @GetMapping("/{taskId}")
    public TaskDTO getone(@PathVariable String taskId){
        return null;
    }
    @PostMapping("/{taskId}")
    public TaskDTO create(@RequestBody TaskDTO dto){
        return taskService.create(dto);
    }
    @PutMapping("/{taskId}")
    public TaskDTO edit(@PathVariable TaskDTO dto){
        return null;
    }
    @DeleteMapping("/{taskId}")
    public TaskDTO delete(@PathVariable String taskId){
        return null;
    }
}
