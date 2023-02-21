package com.odiouma.bibliotheques.controller;

import com.odiouma.bibliotheques.model.Auteurs;
import com.odiouma.bibliotheques.service.ServiceAuteurs;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auteurs")
@AllArgsConstructor
public class ControllerAuteurs {
    private final ServiceAuteurs serviceAuteurs;

    @PostMapping("/create")
    public Auteurs create(@RequestBody Auteurs auteur) {
        return serviceAuteurs.creer(auteur);
    }

    @GetMapping("/read")
    public List<Auteurs> read() {
        return serviceAuteurs.lire();
    }

    @PutMapping("/update/{id}")
    public Auteurs update(@PathVariable Long id, @RequestBody Auteurs auteur) {
        return serviceAuteurs.modifier(id, auteur);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        return serviceAuteurs.supprimer(id);
    }
}