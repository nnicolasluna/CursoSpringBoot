package com.example.demo.categories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping
    public List<CategoryDTO> getall(@RequestParam(value = "statusId", required = false) List<String> statusIdList){
        return categoryService.getAll();
    }
    @GetMapping("/{categoryId}")
    public CategoryDTO getone(@PathVariable String taskId){
        return null;
    }
    @PostMapping("/{taskId}")
    public CategoryDTO create(@RequestBody CategoryDTO dto){
        return categoryService.create(dto);
    }
    @PutMapping("/{taskId}")
    public CategoryDTO edit(@PathVariable CategoryDTO dto){
        return null;
    }
    @DeleteMapping("/{taskId}")
    public CategoryDTO delete(@PathVariable String taskId){
        return null;
    }
}
