package Benedetto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Benedetto.dao.IPizzaDAO;
import Benedetto.dao.PizzaRepository;
import Benedetto.entities.Pizza;
import Benedetto.exception.ItemNotFoundException;
import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class PizzaService implements IPizzaDAO {

	@Autowired
	private PizzaRepository pizzaRepo;

	public void save(Pizza pizza) {
		pizzaRepo.save(pizza);
		log.info("Pizza " + pizza.getNome() + " salvata!");
	}

	public void update(Pizza pizza) {
		pizzaRepo.save(pizza);
		log.info("Pizza " + pizza.getNome() + " aggiornata!");
	}

	public void delete(int id) {
		Pizza pizza = this.findById(id);
		pizzaRepo.delete(pizza);
		log.info("Pizza con ID " + id + " cancellata!");
	}

	public Pizza findById(int id) throws ItemNotFoundException {
		return pizzaRepo.findById(id).orElseThrow(() -> new ItemNotFoundException(id));
	}

	public List<Pizza> findAll() {
		return pizzaRepo.findAll();
	}
}
