package com.odiouma.bibliotheques.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "LIVRES")
@Setter
@Getter
@NoArgsConstructor
public class Livres {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 35)
    private String titre;
    @Column(length = 35)
    private String description;

    @Column(nullable = false)
    private Long id_Auteur;
    @Column(nullable = false)
    private Long id_Categorie;
    @Column(length =12)
    private String date;

}










