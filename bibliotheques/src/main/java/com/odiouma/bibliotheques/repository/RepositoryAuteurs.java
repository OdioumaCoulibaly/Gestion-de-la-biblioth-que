package com.odiouma.bibliotheques.repository;

import com.odiouma.bibliotheques.model.Auteurs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryAuteurs extends JpaRepository<Auteurs,Long> {
}
