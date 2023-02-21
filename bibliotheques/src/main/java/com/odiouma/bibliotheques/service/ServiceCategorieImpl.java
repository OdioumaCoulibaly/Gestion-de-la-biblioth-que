package com.odiouma.bibliotheques.service;

import com.odiouma.bibliotheques.model.Auteurs;
import com.odiouma.bibliotheques.model.Categorie;
import com.odiouma.bibliotheques.repository.RepositoryCategorie;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ServiceCategorieImpl implements ServiceCategorie{
    @Autowired
    private final RepositoryCategorie repositoryCategorie;

    @Override
    public Categorie creer(Categorie categorie) {
        return repositoryCategorie.save(categorie);
    }

    @Override
    public List<Categorie> lire() {
        return repositoryCategorie.findAll();
    }

    @Override
    public Categorie modifier(Long id, Categorie categorie) {
        return repositoryCategorie.findById(id)
                .map(c->{
                    c.setLibelle(categorie.getLibelle());
                    c.setDescription(categorie.getDescription());
                    return  repositoryCategorie.save(c);
                }).orElseThrow(()-> new RuntimeException("Catégorie non trouvée !"));
    }

    @Override
    public String supprimer(Long id) {
         repositoryCategorie.deleteById(id);
        return "Catégorie supprimée !";
    }
}
