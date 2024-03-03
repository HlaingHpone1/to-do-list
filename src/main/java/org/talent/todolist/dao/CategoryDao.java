package org.talent.todolist.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.talent.todolist.entity.Category;

@Repository
public interface CategoryDao extends JpaRepository<Category, Long> {
}
