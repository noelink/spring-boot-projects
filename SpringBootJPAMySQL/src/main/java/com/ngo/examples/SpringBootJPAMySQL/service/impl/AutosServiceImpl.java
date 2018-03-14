package com.ngo.examples.SpringBootJPAMySQL.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ngo.examples.SpringBootJPAMySQL.model.Automovil;
import com.ngo.examples.SpringBootJPAMySQL.repository.AutosRepository;
import com.ngo.examples.SpringBootJPAMySQL.service.AutosService;



@Service
public class AutosServiceImpl implements AutosService {

	@Autowired
	private AutosRepository repository;
	
	@Override
	public Automovil saveAuto(Automovil auto) {
		return repository.save(auto);

	}

	@Override
	public Automovil findAuto(Long idAuto) {
		return repository.findOne(idAuto);
	}

	@Override
	public Iterable<Automovil> findAll() {
		return repository.findAll();
	}

	@Override
	public Automovil findByMarca(String marca) {
		return repository.findByMarca(marca);
	}

}
