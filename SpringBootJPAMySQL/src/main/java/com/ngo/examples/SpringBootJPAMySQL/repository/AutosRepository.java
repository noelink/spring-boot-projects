package com.ngo.examples.SpringBootJPAMySQL.repository;

import org.springframework.data.repository.CrudRepository;
import com.ngo.examples.SpringBootJPAMySQL.model.Automovil;


public interface AutosRepository extends CrudRepository<Automovil, Long>{
   Automovil findByMarca(String marca);
}
