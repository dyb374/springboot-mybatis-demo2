package com.dyb.demo.controller;

import com.dyb.demo.entity.Category;
import com.dyb.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping(value = "/categories/{id}")
    public Category findCategoryById(@PathVariable() Integer id){
        Category category;
        category = categoryService.findCategoryById(id);

        return category;
    }

}
