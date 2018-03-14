package com.ngo.examples.SpringBootJPA.repository;

import org.springframework.data.repository.CrudRepository;
import com.ngo.examples.SpringBootJPA.model.Automovil;

public interface AutosRepository extends CrudRepository<Automovil, Long>{
   Automovil findByMarca(String marca);
}
