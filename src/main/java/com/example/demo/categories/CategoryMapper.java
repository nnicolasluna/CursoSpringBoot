package com.example.demo.categories;

import org.springframework.stereotype.Component;

@Component
public class CategoryMapper {
    public  CategoryDTO toDTO(Category category){
        return new CategoryDTO();
    }
    public Category toModel(CategoryDTO dto){
        return  new Category();
    }
}
