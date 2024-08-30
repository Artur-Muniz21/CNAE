package com.example.SEFA_Sprint4.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.SEFA_Sprint4.client.IbgeClient;
import com.example.SEFA_Sprint4.dto.IbgeClassesDTO;
import com.example.SEFA_Sprint4.dto.IbgeDivisaoDTO;
import com.example.SEFA_Sprint4.dto.IbgeGruposDTO;
import com.example.SEFA_Sprint4.dto.IbgeSubclassesDTO;
import com.example.SEFA_Sprint4.dto.completos.IbgeClasseCompletaDTO;
import com.example.SEFA_Sprint4.dto.completos.IbgeDivisaoCompletaDTO;
import com.example.SEFA_Sprint4.dto.completos.IbgeGrupoCompletoDTO;
import com.example.SEFA_Sprint4.dto.completos.IbgeSecaoCompletoDTO;
import com.example.SEFA_Sprint4.dto.completos.IbgeSubclasseCompletoDTO;

@Service
public class IbgeService {

    private final IbgeClient ibgeClient; 
    
    public IbgeService(IbgeClient ibgeClient) {
        this.ibgeClient = ibgeClient; 
    }
	
	public List<IbgeSecaoCompletoDTO> getSecao(){
		return ibgeClient.getSecao();
	}
	
	public List<IbgeDivisaoDTO> getDivisao(String id){
		return ibgeClient.getDivisao(id);
	}
	
	public List<IbgeDivisaoCompletaDTO> getDivisaoFull(String id){
		return ibgeClient.getDivisaoFull(id);
	}
	
	public List<IbgeGruposDTO> getGrupos(String id){
		return ibgeClient.getGrupos(id);
	}
	
	public List<IbgeGrupoCompletoDTO> getGruposFull(String id){
		return ibgeClient.getGruposFull(id);
	}
	
	public List<IbgeClassesDTO> getClasses(String id){
		return ibgeClient.getClasses(id);
	}
	
	public List<IbgeClasseCompletaDTO> getClassesFull(String id){
		return ibgeClient.getClassesFull(id);
	}
	
	public List<IbgeSubclassesDTO> getSubclasses(String id){
		return ibgeClient.getSubclasses(id);
	}
	
	public List<IbgeSubclasseCompletoDTO> getSubclassesFull(String id){
		return ibgeClient.getSubclassesFull(id);
	}
}
