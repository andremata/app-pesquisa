package com.andremata.apppesquisa.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.andremata.apppesquisa.dto.GameDTO;
import com.andremata.apppesquisa.entities.Game;
import com.andremata.apppesquisa.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	GameRepository repository;
	
	@Transactional(readOnly = true) //evitar looking no banco e garantir que o acesso aos dados acaba nesta camada
	public List<GameDTO> consultar() {
		List<Game> games = repository.findAll();
	
		return games.stream()
					.map(x -> new GameDTO(x))
					.collect(Collectors.toList());
	}
}
