package org.talent.todolist.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.talent.todolist.dao.CategoryDao;
import org.talent.todolist.dto.NewCategoryRequest;
import org.talent.todolist.entity.Category;
import org.talent.todolist.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDao categoryDao;


    @Override
    public Category NewCategory(NewCategoryRequest name) {
        
        return null;
    }
}
