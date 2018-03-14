package com.ngo.examples.SpringBootJPAMySQL.service;

import com.ngo.examples.SpringBootJPAMySQL.model.Automovil;

public interface AutosService {
	  
	Automovil saveAuto(Automovil auto);
  
   Automovil findAuto(Long idAuto);
   
   Iterable<Automovil> findAll();
   
   Automovil findByMarca(String marca);
}
