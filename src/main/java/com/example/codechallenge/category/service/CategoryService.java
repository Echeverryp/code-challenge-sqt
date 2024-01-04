package com.example.codechallenge.category.service;

import com.example.codechallenge.category.model.Category;

public interface CategoryService {

    public Category findByKeyWord(String keyWord,String categoryName);
}
