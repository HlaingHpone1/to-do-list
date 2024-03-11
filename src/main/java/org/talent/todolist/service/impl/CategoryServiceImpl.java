package org.talent.todolist.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.talent.todolist.dao.CategoryDao;
import org.talent.todolist.dto.NewCategoryRequest;
import org.talent.todolist.dto.NewTaskRequest;
import org.talent.todolist.entity.Category;
import org.talent.todolist.service.CategoryService;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDao categoryDao;

    @Autowired
    private ModelMapper mapper;

    @Override
    public Category NewCategory(NewCategoryRequest request) {

        Category category = mapper.map(request, Category.class);

        return categoryDao.save(category);
    }

    @Override
    public List<Category> findAll() {
        return categoryDao.findAll();
    }

    @Override
    public void delete(Long id) {
        if (categoryDao.existsById(id)){
            categoryDao.deleteById(id);
        }
    }

    @Override
    public Category findById(Long id) {
        return categoryDao.findById(id).orElse(null);
    }

    @Override
    public Category updateById(Long id, NewCategoryRequest request) {

        Category category = null;
        if (categoryDao.existsById(id)){
            category = Category.builder()
                    .id(id)
                    .name(request.getName())
                    .imgUrl(request.getImgUrl())
                    .build();
        }

        return categoryDao.save(category);
    }
}
