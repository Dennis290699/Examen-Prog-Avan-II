package com.programacion.db;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "usuario")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre")
    private String name;

    private String email;

    @Column(name = "fecha_registro")
    private String dateRegister;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Loan> loans;
}


