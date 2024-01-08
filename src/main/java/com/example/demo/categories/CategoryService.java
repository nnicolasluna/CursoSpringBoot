package com.example.demo.categories;

import org.springframework.stereotype.Component;

import java.util.List;

public interface CategoryService {
    public List<CategoryDTO> getAll();

    CategoryDTO create(CategoryDTO dto);
}
