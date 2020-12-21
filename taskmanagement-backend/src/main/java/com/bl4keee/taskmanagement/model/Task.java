package com.bl4keee.taskmanagement.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name="task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "task")
    private String task;

    @Column(name = "description")
    private String description;

    @Column(name = "giver")
    private String giver;

    @Column(name= "assignee")
    private String assignee;

    @Column(name = "due_date")
    private String dueDate;
}
