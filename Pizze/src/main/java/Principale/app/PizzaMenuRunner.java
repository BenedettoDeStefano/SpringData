package Principale.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import Principale.dao.IPizzaDAO;
import Principale.entities.Pizza;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class PizzaMenuRunner implements CommandLineRunner {

	@Autowired
	private IPizzaDAO pizzaDAO;

	@Override
	public void run(String... args) throws Exception {
		Pizza margherita = Pizza.builder().nome("Margherita").prezzo(8.5).build();
		pizzaDAO.save(margherita);

		Pizza diavola = Pizza.builder().nome("Diavola").prezzo(9.5).build();
		pizzaDAO.save(diavola);

		Pizza pizzaToUpdate = pizzaDAO.findById(1);
		pizzaToUpdate.setNome("Margherita Speciale");
		pizzaDAO.update(pizzaToUpdate);

		pizzaDAO.delete(2);

		log.info("************ PIZZA MENU ************");
		pizzaDAO.findAll().forEach(pizza -> log.info(pizza.toString()));
	}
	}
