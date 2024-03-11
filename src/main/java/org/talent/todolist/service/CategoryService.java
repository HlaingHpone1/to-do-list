package org.talent.todolist.service;

import org.talent.todolist.dto.NewCategoryRequest;
import org.talent.todolist.dto.NewTaskRequest;
import org.talent.todolist.entity.Category;

import java.util.List;

public interface CategoryService {
    Category NewCategory(NewCategoryRequest request);

    List<Category> findAll();
    void delete(Long id);

    Category findById(Long id);
    Category updateById(Long id, NewCategoryRequest request);

}
