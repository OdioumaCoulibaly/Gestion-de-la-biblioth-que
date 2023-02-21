package com.odiouma.bibliotheques.controller;

import com.odiouma.bibliotheques.model.Categorie;
import com.odiouma.bibliotheques.model.Livres;
import com.odiouma.bibliotheques.service.ServiceCategorie;
import com.odiouma.bibliotheques.service.ServiceLivres;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
@AllArgsConstructor
public class ControllerCategorie {
    private final ServiceCategorie serviceCategorie;

    @PostMapping("/create")
    public Categorie create(@RequestBody Categorie categorie){
        return serviceCategorie.creer(categorie);
    }

    @GetMapping("/read")
    public List<Categorie> read(){
        return serviceCategorie.lire();
    }

    @PutMapping("/update/{id}")
    public Categorie update(@PathVariable Long id, @RequestBody Categorie categorie){
        return serviceCategorie.modifier(id, categorie);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return serviceCategorie.supprimer(id);
    }
}
