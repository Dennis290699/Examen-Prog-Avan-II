package com.programacion.db;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "libro")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "titulo")
    private String title;

    @Column(name = "autor")
    private String author;

    @Column(name = "categoria")
    private String category;

    @Column(name = "disponible")
    private Boolean isAvailable;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "book")
    private List<Loan> loans;
}
