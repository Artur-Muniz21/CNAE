package com.example.SEFA_Sprint4.dto.completos;

import java.util.List;

import com.example.SEFA_Sprint4.dto.IbgeGruposDTO;
import com.fasterxml.jackson.annotation.JsonInclude;

public class IbgeGrupoCompletoDTO extends IbgeGruposDTO{
	
	private IbgeDivisaoCompletaDTO divisao;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private List<String> observacoes;

	public IbgeGrupoCompletoDTO(String id, String descricao, IbgeDivisaoCompletaDTO divisao, List<String> observacoes) {
		super(id, descricao);
		this.divisao = divisao;
		this.observacoes = observacoes;
	}
	
	public IbgeGrupoCompletoDTO() {

	}

	public IbgeDivisaoCompletaDTO getDivisao() {
		return divisao;
	}

	public void setDivisao(IbgeDivisaoCompletaDTO divisao) {
		this.divisao = divisao;
	}

	public List<String> getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(List<String> observacoes) {
		this.observacoes = observacoes;
	}
	
	

}
