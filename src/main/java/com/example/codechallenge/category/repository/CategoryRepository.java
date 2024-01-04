package com.example.codechallenge.category.repository;

import com.example.codechallenge.category.common.Utilities;
import com.example.codechallenge.category.model.Category;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryRepository {

    private List<Category> categoryList= Utilities.getCategories();

    public List<Category> findAll() {
        return categoryList;
    }
}
