package com.andremata.apppesquisa.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Genre implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	
	private List<Game> games = new ArrayList<>();
	
	public Genre() {
	}

	public Genre(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	public List<Game> getGames() {
		return games;
	}
}
