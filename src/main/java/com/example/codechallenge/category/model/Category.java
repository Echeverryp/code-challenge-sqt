package com.example.codechallenge.category.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Category {
    private Long id;
    private String name;
    private List<String> keyWords;
    private Long parentId;
    private Long level;
}
