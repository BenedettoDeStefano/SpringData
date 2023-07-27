package it.epicode.be.godfather.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Pizzaimpl implements Pizza {

	@Id
	@GeneratedValue
	private Long id;


	@Override
	public Double getCalories() {
		return null;
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public Double getPrice() {
		return null;
	}

	@Override
	public String getMenuItemLine() {
		return null;
	}

}
