package com.odiouma.bibliotheques.service;

import com.odiouma.bibliotheques.model.Livres;
import com.odiouma.bibliotheques.repository.RepositoryLivres;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class ServiceLivresImpl implements ServiceLivres{
    @Autowired
    private final RepositoryLivres repositoryLivres;
    @Override
    public Livres creer(Livres livre) {
        return  repositoryLivres.save(livre);
    }

    @Override
    public List<Livres> lire() {
        return repositoryLivres.findAll();
    }

    @Override
    public Livres modifier(Long id, Livres livre) {
        return repositoryLivres.findById(id)
                .map(l-> {
                    l.setTitre(livre.getTitre());
                    l.setDate(livre.getDate());
                    l.setDescription(livre.getDescription());
                    l.setId_Auteur(livre.getId_Auteur());
                    l.setId_Categorie(livre.getId_Categorie());
                    l.setIsbn(livre.getIsbn());
                    return repositoryLivres.save(l);
                }).orElseThrow(() -> new RuntimeException("Livre non trouvé !"));
    }

    @Override
    public String supprimer(Long id) {
        repositoryLivres.deleteById(id);
        return "Livre supprimer !";
    }

}
