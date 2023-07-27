package it.epicode.be.godfather.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Tavolo {

	@Id
	@GeneratedValue
	private Long id;

	private final Integer numero;
	private final Integer numeroMassimoCoperti;
	private Boolean occupato = false;

	public Tavolo(Integer numero, Integer numeroMassimoCoperti, Boolean occupato) {
		this.numero = numero;
		this.numeroMassimoCoperti = numeroMassimoCoperti;
		this.occupato = occupato;
	}
	
	
	public Boolean getOccupato() {
		return occupato;
	}
	public void setOccupato(Boolean occupato) {
		this.occupato = occupato;
	}
	public Integer getNumero() {
		return numero;
	}
	public Integer getNumeroMassimoCoperti() {
		return numeroMassimoCoperti;
	}
	
}
