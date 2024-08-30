package com.example.SEFA_Sprint4.dto.completos;

import java.util.List;

import com.example.SEFA_Sprint4.dto.IbgeSecaoDTO;
import com.fasterxml.jackson.annotation.JsonInclude;

public class IbgeSecaoCompletoDTO extends IbgeSecaoDTO{
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private List<String> observacoes;

	public IbgeSecaoCompletoDTO(String id, String descricao, List<String> observacoes) {
		super(id, descricao);
		this.observacoes = observacoes;
	}

	public List<String> getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(List<String> observacoes) {
		this.observacoes = observacoes;
	}
}
