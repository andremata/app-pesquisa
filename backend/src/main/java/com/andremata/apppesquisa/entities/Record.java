package com.andremata.apppesquisa.entities;

import java.io.Serializable;
import java.time.Instant;

public class Record implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private Integer age;
	private Instant moment;
	private Game game;
	
	public Record() {
	}

	public Record(Integer id, String name, Integer age, Instant moment,  Game game) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.moment = moment;
		this.game = game;
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

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}
}
