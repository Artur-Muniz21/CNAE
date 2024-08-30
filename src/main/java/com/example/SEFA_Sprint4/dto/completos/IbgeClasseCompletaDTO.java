package com.example.SEFA_Sprint4.dto.completos;

import java.util.List;

import com.example.SEFA_Sprint4.dto.IbgeClassesDTO;
import com.fasterxml.jackson.annotation.JsonInclude;

public class IbgeClasseCompletaDTO extends IbgeClassesDTO{
	
	private IbgeGrupoCompletoDTO grupo;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private List<String> observacoes;

	public IbgeClasseCompletaDTO(String id, String descricao, IbgeGrupoCompletoDTO grupo, List<String> observacoes) {
		super(id, descricao);
		this.grupo = grupo;
		this.observacoes = observacoes;
	}
	
	public IbgeClasseCompletaDTO() {

	}

	public IbgeGrupoCompletoDTO getGrupo() {
		return grupo;
	}

	public void setGrupo(IbgeGrupoCompletoDTO grupo) {
		this.grupo = grupo;
	}

	public List<String> getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(List<String> observacoes) {
		this.observacoes = observacoes;
	}
}
