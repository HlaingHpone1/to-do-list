package org.talent.todolist.entity;

import jakarta.persistence.*;
import lombok.*;
import org.talent.todolist.enumeration.RepeateType;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String label;
    private LocalTime startTime;
    private LocalTime endTime;

    @Enumerated(EnumType.STRING)
//    without store with string annotation, it store with index number
    private RepeateType repeateType;

//    @ManyToOne(cascade = CascadeType.MERGE)
    @ManyToOne
    private Category category;

}
