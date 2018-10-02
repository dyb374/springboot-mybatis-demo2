package com.dyb.demo.service;

import com.dyb.demo.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAll();
    Category findCategoryById(int id);
}
