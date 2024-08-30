package com.example.SEFA_Sprint4.dto.completos;


import java.util.List;

import com.example.SEFA_Sprint4.dto.IbgeDivisaoDTO;
import com.fasterxml.jackson.annotation.JsonInclude;


public class IbgeDivisaoCompletaDTO extends IbgeDivisaoDTO{

	private IbgeSecaoCompletoDTO secao;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private List<String> observacoes;
	
	public IbgeDivisaoCompletaDTO(String id, String descricao, IbgeSecaoCompletoDTO secao, List<String> observacoes) {
		super(id, descricao);
		this.secao = secao;
		this.observacoes = observacoes;
	}

	public IbgeDivisaoCompletaDTO() {

	}

	public IbgeSecaoCompletoDTO getSecao() {
		return secao;
	}

	public void setSecao(IbgeSecaoCompletoDTO secao) {
		this.secao = secao;
	}

	public List<String> getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(List<String> observacoes) {
		this.observacoes = observacoes;
	}
}
