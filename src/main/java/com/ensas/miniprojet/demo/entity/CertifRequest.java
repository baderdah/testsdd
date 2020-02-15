package com.ensas.miniprojet.demo.entity;


import com.ensas.miniprojet.demo.entity.user.student.Student;
import com.ensas.miniprojet.demo.model.TypeCertificat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CertifRequest {
    @Id
    @GeneratedValue
    private Long id;
    private TypeCertificat typeCertificat;

    @OneToOne
    private Student student;
}
