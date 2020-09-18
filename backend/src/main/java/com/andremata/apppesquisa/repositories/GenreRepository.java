package com.andremata.apppesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andremata.apppesquisa.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Integer> {

}
