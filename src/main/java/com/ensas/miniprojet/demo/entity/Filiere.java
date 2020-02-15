package com.ensas.miniprojet.demo.entity;


import com.ensas.miniprojet.demo.entity.user.prof.Prof;

import javax.persistence.*;
import java.util.List;

@Entity
public class Filiere {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;

    @ManyToOne
    private Departement departement;


    @OneToMany(mappedBy = "filiere")
    List<Classe> classes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
