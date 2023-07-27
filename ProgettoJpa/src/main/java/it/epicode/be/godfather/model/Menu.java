package it.epicode.be.godfather.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Menu {
	
	@Id
	@GeneratedValue
	private Long id;

	@OneToMany
	private final List<Pizza> menuPizza = new ArrayList<>();
	@OneToMany
	private final List<PizzaTopping> menuTopping = new ArrayList<>();
	@OneToMany
	private final List<Drink> menuDrink = new ArrayList<>();
	@OneToMany
	private final List<Franchise> menuFranchise = new ArrayList<>();
	
	
	public List<Pizza> getMenuPizza() {
		return menuPizza;
	}
	public List<PizzaTopping> getMenuTopping() {
		return menuTopping;
	}
	public List<Drink> getMenuDrink() {
		return menuDrink;
	}
	public List<Franchise> getMenuFranchise() {
		return menuFranchise;
	}

}
