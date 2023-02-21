package com.odiouma.bibliotheques.service;

import com.odiouma.bibliotheques.model.Auteurs;
import com.odiouma.bibliotheques.model.Livres;

import java.util.List;

public interface ServiceAuteurs {


    Auteurs creer(Auteurs auteur);

    List<Auteurs> lire();

    Auteurs modifier(Long id, Auteurs auteur);

    String supprimer(Long id);
}
