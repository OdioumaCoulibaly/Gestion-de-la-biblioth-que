package com.odiouma.bibliotheques.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "AUTEURS")
@Setter
@Getter
@NoArgsConstructor
public class Auteurs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 35)
    private String nom;

    @Column(length = 35)
    private String prenom;
    @Column(length = 35)
    private String nationalite;
}
