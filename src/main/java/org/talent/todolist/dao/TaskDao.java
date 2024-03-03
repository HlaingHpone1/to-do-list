package org.talent.todolist.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.talent.todolist.entity.Task;

@Repository
public interface TaskDao extends JpaRepository<Task, Long> {
}
