package com.odiouma.bibliotheques.service;

import com.odiouma.bibliotheques.model.Auteurs;
import com.odiouma.bibliotheques.repository.RepositoryAuteurs;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class ServiceAuteursImpl  implements ServiceAuteurs{
    @Autowired
    private final RepositoryAuteurs  repositoryAuteurs;

    @Override
    public Auteurs creer(Auteurs auteur) {
        return repositoryAuteurs.save(auteur);
    }

    @Override
    public List<Auteurs> lire() {
        return repositoryAuteurs.findAll();
    }

    @Override
    public Auteurs modifier(Long id, Auteurs auteur) {
        return repositoryAuteurs.findById(id)
                .map(a->{
                    a.setNom(auteur.getNom());
                    a.setPrenom(auteur.getPrenom());
                    a.setNationalite(auteur.getNationalite());
                    return repositoryAuteurs.save(a);
                }).orElseThrow(()-> new RuntimeException("Auteur non touvé !"));
    }

    @Override
    public String supprimer(Long id) {
        repositoryAuteurs.deleteById(id);
        return "Auteur supprimer !";
    }
}
