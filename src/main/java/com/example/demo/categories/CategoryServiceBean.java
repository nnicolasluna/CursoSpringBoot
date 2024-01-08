package com.example.demo.categories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
@Component
public class CategoryServiceBean implements CategoryService{
    @Autowired
    private CategoryMapper mapper;
    @Autowired
    private CategoryRepository categoryRepository;
    public List<CategoryDTO> getAll(){
        return categoryRepository
                .findAll()
                .stream()
                .map(category -> mapper.toDTO(category))
                .collect(Collectors.toList());
    }
    @Override
    public CategoryDTO create(CategoryDTO dto){
        Category category = mapper.toModel(dto);
        Category saveCategory = categoryRepository.save(category);
        return mapper.toDTO(saveCategory);
    }
}
