package org.talent.todolist.service;

import org.talent.todolist.dto.NewCategoryRequest;
import org.talent.todolist.entity.Category;

import java.util.List;

public interface CategoryService {
    Category NewCategory(NewCategoryRequest request);

    List<Category> findAll();
    void delete(Long id);

}
