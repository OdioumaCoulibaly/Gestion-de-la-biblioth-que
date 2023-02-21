package com.odiouma.bibliotheques.controller;

import com.odiouma.bibliotheques.model.Livres;
import com.odiouma.bibliotheques.service.ServiceLivres;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/livres")
@AllArgsConstructor
public class controllerLivres {
    private final ServiceLivres serviceLivres;

    @PostMapping("/create")
    public Livres create(@RequestBody Livres livre){
        return serviceLivres.creer(livre);
    }

    @GetMapping("/read")
    public List<Livres> read(){
        return serviceLivres.lire();
    }

    @PutMapping("/update/{id}")
    public Livres update(@PathVariable Long id, @RequestBody Livres livre){
        return serviceLivres.modifier(id,livre);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return serviceLivres.supprimer(id);
    }

}
