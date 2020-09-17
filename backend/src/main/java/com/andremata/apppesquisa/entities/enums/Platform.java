package com.andremata.apppesquisa.entities.enums;

public enum Platform {
	
	PC(0, "Pc"),
	PLAYSTATION(1, "PlayStation"),
	XBOX(2, "Xbox");
	
	private int id;
	private String descricao;
	
	private Platform(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static Platform toEnum(Integer id) {
		if (id == null) {
			return null;
		}
		
		for (Platform tipo : Platform.values()) {
			if (id.equals(tipo.getId())) {
				return tipo;
			}
		}
		
		throw new IllegalArgumentException("Id inválido " + id);
	}
}
