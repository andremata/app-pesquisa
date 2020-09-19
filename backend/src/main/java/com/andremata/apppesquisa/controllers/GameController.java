package com.andremata.apppesquisa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andremata.apppesquisa.dto.GameDTO;
import com.andremata.apppesquisa.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

	@Autowired
	GameService service;
	
	@GetMapping
	public ResponseEntity<List<GameDTO>> consultar() {
		List<GameDTO> games = service.consultar();
		
		return ResponseEntity.ok().body(games);
	}
}
