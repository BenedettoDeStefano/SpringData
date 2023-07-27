package Principale.dao;

import java.util.List;

import Principale.entities.Pizza;

public interface IPizzaDAO {

	public void save(Pizza pizza);

	public void update(Pizza pizza);

	public void delete(int id);

	public Pizza findById(int id);

	List<Pizza> findAll();
	


}
