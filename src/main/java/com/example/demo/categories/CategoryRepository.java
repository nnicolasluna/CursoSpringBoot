package com.example.demo.categories;

import java.util.Collection;

public interface CategoryRepository {
    Collection<Category> findAll();

    Category save(Category category);
}
