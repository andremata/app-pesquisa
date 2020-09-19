package com.andremata.apppesquisa.dto;

import java.io.Serializable;

import com.andremata.apppesquisa.entities.Game;
import com.andremata.apppesquisa.entities.enums.Platform;

public class GameDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String title;
	private Platform platform;
	
	public GameDTO() {
	}
	
	public GameDTO(Game game) {
		this.id = game.getId();
		this.title = game.getTitle();
		this.platform = game.getPlatform();
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
}
