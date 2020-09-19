package com.andremata.apppesquisa.controllers;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.andremata.apppesquisa.dto.RecordDTO;
import com.andremata.apppesquisa.dto.RecordInsertDTO;
import com.andremata.apppesquisa.services.RecordService;

@RestController
@RequestMapping(value = "records")
public class RecordController {

	@Autowired
	RecordService service;
	
	@GetMapping
	public ResponseEntity<Page<RecordDTO>> consultar(
			@RequestParam(value = "minDate", defaultValue = "") String minDate,
			@RequestParam(value = "maxDate", defaultValue = "") String maxDate,
			@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "linesPerPage", defaultValue = "0") Integer linesPerPage,
			@RequestParam(value = "orderBy", defaultValue = "moment") String orderBy,
			@RequestParam(value = "direction", defaultValue = "DESC") String direction) {
		
		Instant minData = ("".equals(minDate)) ? null : Instant.parse(minDate);
		Instant maxData = ("".equals(maxDate)) ? null : Instant.parse(maxDate);
		
		if (linesPerPage == 0) {
			linesPerPage = Integer.MAX_VALUE;
		}
		
		PageRequest pr = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		
		Page<RecordDTO> records = service.consultar(minData, maxData, pr);
		
		return ResponseEntity.ok().body(records);
	}
	
	@PostMapping
	public ResponseEntity<RecordDTO> inserir(@RequestBody RecordInsertDTO dto) {
		RecordDTO record = service.inserir(dto);
		
		return ResponseEntity.ok().body(record);
	}
}
