package com.ensas.miniprojet.demo.entity;

import com.ensas.miniprojet.demo.entity.user.student.Student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Absence {
    @Id
    @GeneratedValue
    private Long id;
    private Integer numberOfAbsence;

    @OneToOne
    private Student student;

    @OneToOne
    private Module module;



}
