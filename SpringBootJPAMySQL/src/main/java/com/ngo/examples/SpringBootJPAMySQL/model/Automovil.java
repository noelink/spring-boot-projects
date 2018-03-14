package com.ngo.examples.SpringBootJPAMySQL.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Automovil {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long idAuto;
	private String marca;
	private String color;
	private String motor;
	private Integer cilindros;
	public long getIdAuto() {
		return idAuto;
	}
	public void setIdAuto(long idAuto) {
		this.idAuto = idAuto;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public Integer getCilindros() {
		return cilindros;
	}
	public void setCilindros(Integer cilindros) {
		this.cilindros = cilindros;
	}
	@Override
	public String toString() {
		return "Datos del Automovil [idAuto=" + idAuto + ", marca=" + marca + ", color=" + color + ", motor=" + motor
				+ ", cilindros=" + cilindros + "]";
	}
		
	
}
