package com.ngo.examples.SpringBootJPAMySQL.restcontrollers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ngo.examples.SpringBootJPAMySQL.model.Automovil;
import com.ngo.examples.SpringBootJPAMySQL.service.AutosService;

@RestController
public class AutosController {
   
	@Autowired
	private AutosService service;
	
	@CrossOrigin
	@RequestMapping(value="/modelos")
	public List<Automovil> consultaModelos(){
		List<Automovil> listAutos = new ArrayList<Automovil>();
		for(Automovil auto : service.findAll()) {
			listAutos.add(auto);			
		}
		return listAutos;
	}
	
	@RequestMapping(value="/cargar")
	public String cargaModelos(){
		Automovil golf = new Automovil();
		golf.setCilindros(4);
		golf.setColor("Azul");
		golf.setMarca("Volkswagen");
		golf.setMotor("1.4 TSI");
		
		Automovil mazda3 = new Automovil();
		mazda3.setCilindros(4);
		mazda3.setColor("Rojo");
		mazda3.setMarca("Mazda");
		mazda3.setMotor("2.0 SkyActive");
		
		Automovil focus = new Automovil();
		focus.setCilindros(4);
		focus.setColor("Blanco");
		focus.setMarca("Ford");
		focus.setMotor("2.0 ecobust");
		
		Automovil leon = new Automovil();
		leon.setCilindros(4);
		leon.setColor("Rojo");
		leon.setMarca("Seat");
		leon.setMotor("1.4 TSI");
		
		service.saveAuto(golf);
		service.saveAuto(mazda3);
		service.saveAuto(focus);
		service.saveAuto(leon);
		
		return "Carga Completa!!";
		
	}

	@RequestMapping(value="/modelos/{marca}")
	public Automovil byMarca(@PathVariable(name="marca")String marca){
		
		return service.findByMarca(marca); 				
				
	}
	
	@RequestMapping(value="/modelos/nuevo", method=RequestMethod.POST)	
	public Automovil guardarNuevo(@RequestBody Automovil auto){
		
		return service.saveAuto(auto); 				
				
	}
	
}
