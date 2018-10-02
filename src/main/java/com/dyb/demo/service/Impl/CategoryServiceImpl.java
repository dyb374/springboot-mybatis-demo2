package com.dyb.demo.service.Impl;

import com.dyb.demo.dao.CategoryDao;
import com.dyb.demo.entity.Category;
import com.dyb.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryDao categoryDao;

    @Override
    public List<Category> getAll() {
        List<Category> categories = categoryDao.findAll();
        return categories;
    }

    @Override
    public Category findCategoryById(int id) {
        Category category = categoryDao.selectByPrimaryKey(id);
        return category;
    }
}
