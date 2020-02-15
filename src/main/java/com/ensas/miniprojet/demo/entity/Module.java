package com.ensas.miniprojet.demo.entity;


import com.ensas.miniprojet.demo.entity.user.prof.Prof;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.List;

@Entity
public class Module {
    @Id
    @GeneratedValue
    private Long id;
    private String nom;

    @ManyToMany
    private List<Classe> classes;

    @ManyToOne
    private Prof prof;
}
