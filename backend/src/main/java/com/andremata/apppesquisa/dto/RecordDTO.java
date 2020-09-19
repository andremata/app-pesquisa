package com.andremata.apppesquisa.dto;

import java.io.Serializable;
import java.time.Instant;

import com.andremata.apppesquisa.entities.Record;
import com.andremata.apppesquisa.entities.enums.Platform;

public class RecordDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private Integer age;
	private Instant moment;
	private String gameTitle;
	private Platform gamePlatform;
	private String genreName;
	
	public RecordDTO() {
	}
	
	public RecordDTO(Record record) {
		this.id = record.getId();
		this.name = record.getName();
		this.age = record.getAge();
		this.moment = record.getMoment();
		this.setGameTitle(record.getGame().getTitle());
		this.setGamePlatform(record.getGame().getPlatform());
		this.setGenreName(record.getGame().getGenre().getName());
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public String getGameTitle() {
		return gameTitle;
	}

	public void setGameTitle(String gameTitle) {
		this.gameTitle = gameTitle;
	}

	public Platform getGamePlatform() {
		return gamePlatform;
	}

	public void setGamePlatform(Platform gamePlatform) {
		this.gamePlatform = gamePlatform;
	}

	public String getGenreName() {
		return genreName;
	}

	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}
}
