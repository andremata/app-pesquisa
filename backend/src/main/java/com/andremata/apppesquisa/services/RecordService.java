package com.andremata.apppesquisa.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.andremata.apppesquisa.dto.RecordDTO;
import com.andremata.apppesquisa.dto.RecordInsertDTO;
import com.andremata.apppesquisa.entities.Game;
import com.andremata.apppesquisa.entities.Record;
import com.andremata.apppesquisa.repositories.GameRepository;
import com.andremata.apppesquisa.repositories.RecordRepository;

@Service
public class RecordService {

	@Autowired
	RecordRepository repository;
	
	@Autowired 
	GameRepository gameRepository;
	
	@Transactional
	public RecordDTO inserir(RecordInsertDTO dto) {
		Record record = new Record();
		record.setAge(dto.getAge());
		record.setMoment(Instant.now());
		record.setName(dto.getName());
		
		Game game = gameRepository.getOne(dto.getGameId());
		record.setGame(game);
		
		record = repository.save(record);
		
		return new RecordDTO(record);
	}

	@Transactional(readOnly = true)
	public Page<RecordDTO> consultar(Instant minData, Instant maxData, PageRequest pr) {
		return repository.consultar(minData, maxData, pr).map(x -> new RecordDTO(x));
	}
}
