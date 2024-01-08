package com.example.demo.statuses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/statuses")
public class StatusController {
    @Autowired
    private StatusService statusService;
    @GetMapping
    public List<StatusDTO> getall(@RequestParam(value = "Id", required = false) List<String> cIdList){
        return statusService.getAll();
    }
    @GetMapping("/{taskId}")
    public StatusDTO getone(@PathVariable String taskId){
        return null;
    }
    @PostMapping("/{taskId}")
    public StatusDTO create(@RequestBody StatusDTO dto){
        return statusService.create(dto);
    }
    @PutMapping("/{taskId}")
    public StatusDTO edit(@PathVariable StatusDTO dto){
        return null;
    }
    @DeleteMapping("/{taskId}")
    public StatusDTO delete(@PathVariable String taskId){
        return null;
    }

}
