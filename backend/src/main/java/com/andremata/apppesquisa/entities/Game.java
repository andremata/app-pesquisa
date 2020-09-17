package com.andremata.apppesquisa.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.andremata.apppesquisa.entities.enums.Platform;

public class Game implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String title;
	private Platform platform;
	
	private Genre genre;
	
	private List<Record> records = new ArrayList<>();
	
	public Game() {
	}

	public Game(Integer id, String title, Platform platform, Genre genre) {
		super();
		this.id = id;
		this.title = title;
		this.platform = platform;
		this.genre = genre;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Platform getPlatform() {
		return platform;
	}

	public void setPlatform(Platform platform) {
		this.platform = platform;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public List<Record> getRecords() {
		return records;
	}
}
