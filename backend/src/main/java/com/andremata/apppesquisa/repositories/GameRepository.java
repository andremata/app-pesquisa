package com.andremata.apppesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andremata.apppesquisa.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {

}
