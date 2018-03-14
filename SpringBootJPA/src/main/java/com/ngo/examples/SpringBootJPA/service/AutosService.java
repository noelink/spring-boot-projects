package com.ngo.examples.SpringBootJPA.service;

import com.ngo.examples.SpringBootJPA.model.Automovil;

public interface AutosService {
  
	Automovil saveAuto(Automovil auto);
  
   Automovil findAuto(Long idAuto);
   
   Iterable<Automovil> findAll();
   
   Automovil findByMarca(String marca);
}
