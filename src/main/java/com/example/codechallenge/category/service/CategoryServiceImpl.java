package com.example.codechallenge.category.service;

import com.example.codechallenge.category.common.Utilities;
import com.example.codechallenge.category.model.Category;
import com.example.codechallenge.category.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category findByKeyWord(String keyWord,String categoryName) {

        List<Category> categoryList= Utilities.getCategories();
        var categoryObjectValue=categoryList.stream().filter(category -> category.getName().equalsIgnoreCase(categoryName)).findFirst();
        return getKeyCategoryByKey(categoryObjectValue.get(),keyWord);
    }

    private Category getKeyCategoryByKey(Category categoryList,String keyWord){
        var res= categoryList.getKeyWords().stream().filter(keyWordValue->keyWordValue.equalsIgnoreCase(keyWord)).findFirst().isPresent();

        return  categoryList.getKeyWords().stream().filter(keyWordValue->keyWordValue.equalsIgnoreCase(keyWord)).findFirst().isPresent()? categoryList:
                getKeyCategoryByKey(getKeyWordParent(categoryList),keyWord) ;


    }

    private Category getKeyWordParent(Category category){
        List<Category> categoryList= Utilities.getCategories();
        return categoryList.stream().filter(categoryValue -> categoryValue.getId()==category.getParentId()).findFirst().get();

    }

    public static void main(String[] args) {
        CategoryServiceImpl categoryService=new CategoryServiceImpl();
        var res=categoryService.findByKeyWord("Lawn & Garden", "Electronics Sub");
        System.out.println(res);
    }
}
