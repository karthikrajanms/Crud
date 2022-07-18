package com.karthik.in.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.GenerationType.AUTO;

@Entity@Data@AllArgsConstructor@NoArgsConstructor
public class Professor {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    private String name;
    private String department;
    private int experience;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "professor")
    private List<Student> studentList;
}
