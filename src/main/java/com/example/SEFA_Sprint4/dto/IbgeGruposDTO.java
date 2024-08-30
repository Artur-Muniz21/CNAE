package com.example.SEFA_Sprint4.dto;

public class IbgeGruposDTO {

	private String id;
	private String descricao;
	
	public IbgeGruposDTO(String id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}
	
	public IbgeGruposDTO() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
