package Principale.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Principale.dao.IPizzaDAO;

@Configuration
public class AppConfig {

	@Bean
	public IPizzaDAO pizzaDAO() {
		return new PizzaService();

	}
}