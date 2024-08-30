package com.example.SEFA_Sprint4.resource;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SEFA_Sprint4.dto.IbgeClassesDTO;
import com.example.SEFA_Sprint4.dto.IbgeDivisaoDTO;
import com.example.SEFA_Sprint4.dto.IbgeGruposDTO;
import com.example.SEFA_Sprint4.dto.IbgeSubclassesDTO;
import com.example.SEFA_Sprint4.dto.completos.IbgeClasseCompletaDTO;
import com.example.SEFA_Sprint4.dto.completos.IbgeDivisaoCompletaDTO;
import com.example.SEFA_Sprint4.dto.completos.IbgeGrupoCompletoDTO;
import com.example.SEFA_Sprint4.dto.completos.IbgeSecaoCompletoDTO;
import com.example.SEFA_Sprint4.dto.completos.IbgeSubclasseCompletoDTO;
import com.example.SEFA_Sprint4.service.IbgeService;

@RestController
@RequestMapping("secao")
public class IbgeControler {

	private final IbgeService service; 
	
    public IbgeControler(IbgeService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<IbgeSecaoCompletoDTO>> getSecao(){
    	
    	return ResponseEntity.ok().body(service.getSecao());
    }
    
    @GetMapping("{id}/divisoes")
    public ResponseEntity<List<IbgeDivisaoDTO>> getDivisao(@PathVariable String id){
    	return ResponseEntity.ok().body(service.getDivisao(id));
    }
    
    @GetMapping("{id}/divisoes/full")
    public ResponseEntity<List<IbgeDivisaoCompletaDTO>> getDivisaoFull(@PathVariable String id){
    	return ResponseEntity.ok().body(service.getDivisaoFull(id));
    }
    
    @GetMapping("{id}/grupos")
    public ResponseEntity<List<IbgeGruposDTO>> getGrupos(@PathVariable String id){
    	return ResponseEntity.ok().body(service.getGrupos(id));
    }
    
    @GetMapping("{id}/grupos/full")
    public ResponseEntity<List<IbgeGrupoCompletoDTO>> getGruposFull(@PathVariable String id){
    	return ResponseEntity.ok().body(service.getGruposFull(id));
    }
    
    @GetMapping("{id}/classes")
    public ResponseEntity<List<IbgeClassesDTO>> getClasses(@PathVariable String id){
    	return ResponseEntity.ok().body(service.getClasses(id));
    }
    
    @GetMapping("{id}/classes/full")
    public ResponseEntity<List<IbgeClasseCompletaDTO>> getClassesFull(@PathVariable String id){
    	return ResponseEntity.ok().body(service.getClassesFull(id));
    }
    
    @GetMapping("{id}/subclasses")
    public ResponseEntity<List<IbgeSubclassesDTO>> getSubclasses(@PathVariable String id){
    	return ResponseEntity.ok().body(service.getSubclasses(id));
    }
    
    @GetMapping("{id}/subclasses/full")
    public ResponseEntity<List<IbgeSubclasseCompletoDTO>> getSubclassesFull(@PathVariable String id){
    	return ResponseEntity.ok().body(service.getSubclassesFull(id));
    }
}
