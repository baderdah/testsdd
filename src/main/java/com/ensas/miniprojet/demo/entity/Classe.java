package com.ensas.miniprojet.demo.entity;

import com.ensas.miniprojet.demo.entity.user.student.Student;

import javax.persistence.*;
import java.util.List;

@Entity
public class Classe {

    @Id
    @GeneratedValue
    private Long id;
    private String nom;

    @ManyToOne
    private Filiere filiere;

    @ManyToMany(mappedBy = "classes")
    private List<Module> modules;

    @OneToMany(mappedBy = "classe")
    private List<Student> students;
}
