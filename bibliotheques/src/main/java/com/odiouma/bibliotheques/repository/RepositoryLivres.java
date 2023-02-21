package com.odiouma.bibliotheques.repository;

import com.odiouma.bibliotheques.model.Livres;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryLivres extends JpaRepository<Livres, Long> {
}
