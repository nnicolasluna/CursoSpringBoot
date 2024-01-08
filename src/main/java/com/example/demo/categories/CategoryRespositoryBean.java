package com.example.demo.categories;

import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;
@Component
public class CategoryRespositoryBean implements CategoryRepository{

    @Override
    public Collection<Category> findAll(){
        return Collections.singleton(new Category());
    }

    @Override
    public Category save(Category category) {
        return category;
    }
}
