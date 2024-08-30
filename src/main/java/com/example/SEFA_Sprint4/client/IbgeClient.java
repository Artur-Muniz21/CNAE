package com.example.SEFA_Sprint4.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.SEFA_Sprint4.dto.IbgeClassesDTO;
import com.example.SEFA_Sprint4.dto.IbgeDivisaoDTO;
import com.example.SEFA_Sprint4.dto.IbgeGruposDTO;
import com.example.SEFA_Sprint4.dto.IbgeSubclassesDTO;
import com.example.SEFA_Sprint4.dto.completos.IbgeClasseCompletaDTO;
import com.example.SEFA_Sprint4.dto.completos.IbgeDivisaoCompletaDTO;
import com.example.SEFA_Sprint4.dto.completos.IbgeGrupoCompletoDTO;
import com.example.SEFA_Sprint4.dto.completos.IbgeSecaoCompletoDTO;
import com.example.SEFA_Sprint4.dto.completos.IbgeSubclasseCompletoDTO;

@FeignClient(url = "http://servicodados.ibge.gov.br/api/v2/cnae", name = "ibgeClient")
public interface IbgeClient {

	@GetMapping("secoes")
	List<IbgeSecaoCompletoDTO> getSecao();
	
	@GetMapping("secoes/{id}/divisoes")
	List<IbgeDivisaoDTO> getDivisao(@PathVariable String id);
	
	@GetMapping("secoes/{id}/divisoes")
	List<IbgeDivisaoCompletaDTO> getDivisaoFull(@PathVariable String id);
	
	@GetMapping("divisoes/{id}/grupos")
	List<IbgeGruposDTO> getGrupos(@PathVariable String id);
	
	@GetMapping("divisoes/{id}/grupos")
	List<IbgeGrupoCompletoDTO> getGruposFull(@PathVariable String id);
	
	@GetMapping("grupos/{id}/classes")
	List<IbgeClassesDTO> getClasses(@PathVariable String id);
	
	@GetMapping("grupos/{id}/classes")
	List<IbgeClasseCompletaDTO> getClassesFull(@PathVariable String id);
	
	@GetMapping("classes/{id}/subclasses")
	List<IbgeSubclassesDTO> getSubclasses(@PathVariable String id);
	
	@GetMapping("classes/{id}/subclasses")
	List<IbgeSubclasseCompletoDTO> getSubclassesFull(@PathVariable String id);
}
