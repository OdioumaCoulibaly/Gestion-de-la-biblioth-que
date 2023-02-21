package com.odiouma.bibliotheques.service;

import com.odiouma.bibliotheques.model.Auteurs;
import com.odiouma.bibliotheques.model.Categorie;

import java.util.List;

public interface ServiceCategorie {

    Categorie creer(Categorie categorie);

    List<Categorie> lire();

    Categorie modifier(Long id, Categorie categorie);

    String supprimer(Long id);
}
