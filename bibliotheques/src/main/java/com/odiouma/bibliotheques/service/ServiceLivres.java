package com.odiouma.bibliotheques.service;

import com.odiouma.bibliotheques.model.Livres;

import java.util.List;

public interface ServiceLivres {

    Livres creer(Livres livre);

    List<Livres> lire();

    Livres modifier(Long id, Livres livre);

    String supprimer(Long id);
}
