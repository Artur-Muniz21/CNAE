package com.example.SEFA_Sprint4.dto.completos;

import java.util.List;

import com.example.SEFA_Sprint4.dto.IbgeSubclassesDTO;
import com.fasterxml.jackson.annotation.JsonInclude;

public class IbgeSubclasseCompletoDTO extends IbgeSubclassesDTO{

	private IbgeClasseCompletaDTO classe;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private List<String> observacoes;

	public IbgeSubclasseCompletoDTO(String id, String descricao, IbgeClasseCompletaDTO classe,
			List<String> observacoes) {
		super(id, descricao);
		this.classe = classe;
		this.observacoes = observacoes;
	}
	
	public IbgeSubclasseCompletoDTO() {

	}

	public IbgeClasseCompletaDTO getClasse() {
		return classe;
	}

	public void setClasse(IbgeClasseCompletaDTO classe) {
		this.classe = classe;
	}

	public List<String> getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(List<String> observacoes) {
		this.observacoes = observacoes;
	}
}
