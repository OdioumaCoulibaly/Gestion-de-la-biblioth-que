package com.odiouma.bibliotheques.repository;

import com.odiouma.bibliotheques.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryCategorie extends JpaRepository<Categorie, Long> {
}
