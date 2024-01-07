package com.example.demo.tasks;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @GetMapping
    public List<TaskDTO> getall(@RequestParam("categororyId") List<String> categoryIdList){
        return null;
    }
    @GetMapping("/{taskId}")
    public TaskDTO getone(@PathVariable String taskId){
        return null;
    }
    @PostMapping("/{taskId}")
    public TaskDTO create(@RequestBody TaskDTO dto){
        return null;
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
