package org.talent.todolist.service;

import org.talent.todolist.dto.NewCategoryRequest;
import org.talent.todolist.entity.Category;

public interface CategoryService {
    public Category NewCategory(NewCategoryRequest name);
}
