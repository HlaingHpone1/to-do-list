package org.talent.todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.talent.todolist.dto.NewCategoryRequest;
import org.talent.todolist.entity.Category;
import org.talent.todolist.service.CategoryService;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/categories")
    public Category saveNewCategory(@RequestBody NewCategoryRequest request){
        Category category = categoryService.NewCategory(request);

        return null;
    }


}
