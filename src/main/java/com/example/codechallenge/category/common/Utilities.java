package com.example.codechallenge.category.common;

import com.example.codechallenge.category.model.Category;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Utilities {


    public static List<Category> getCategories(){
        return List.of(Category.builder().id(1l).keyWords(List.of("Products")).level(1l).name("ROOT").parentId(0l).build(),
        Category.builder().id(2l).keyWords(List.of("Furniture")).level(2l).name("Furniture").parentId(1l).build(),
        Category.builder().id(3l).keyWords(List.of("Electronics")).level(2l).name("Electronics").parentId(1l).build(),
        Category.builder().id(4l).keyWords(List.of("Home Appliances")).level(3l).name("Home Appliances").parentId(1l).build(),
        Category.builder().id(5l).keyWords(List.of("Major Appliances")).level(3l).name("Major Appliances").build(),
        Category.builder().id(6l).keyWords(List.of("Minor Appliances")).level(3l).name("Minor Appliances").build(),
        Category.builder().id(7l).keyWords(List.of("Lawn & Garden")).level(3l).name("Lawn & Garden").build(),
        Category.builder().id(8l).keyWords(List.of("")).level(2l).name("Furniture Sub").parentId(7l).build(),
        Category.builder().id(9l).keyWords(List.of("")).level(3l).name("Electronics Sub").parentId(7l).build()
        );

    }

}
