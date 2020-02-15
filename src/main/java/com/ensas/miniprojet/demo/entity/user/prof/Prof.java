package com.ensas.miniprojet.demo.entity.user.prof;

import com.ensas.miniprojet.demo.entity.Departement;
import com.ensas.miniprojet.demo.entity.Module;
import com.ensas.miniprojet.demo.entity.User;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Prof  extends User implements Serializable {

    private String matricule;

    @ManyToOne
    private Departement departement;

    @OneToMany(mappedBy = "prof")
    private List<Module> modules;

    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
}
