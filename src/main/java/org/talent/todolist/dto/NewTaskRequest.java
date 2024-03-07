package org.talent.todolist.dto;

import lombok.Getter;
import lombok.Setter;
import org.talent.todolist.entity.Category;
import org.talent.todolist.enumeration.RepeateType;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
public class NewTaskRequest {
    private String label;
    private LocalTime startTime;
    private LocalTime endTime;
    private RepeateType repeateType;
    private Category category;

}
