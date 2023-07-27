package Principale.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Principale.entities.Pizza;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer> {
}