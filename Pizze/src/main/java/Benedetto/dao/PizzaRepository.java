package Benedetto.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Benedetto.entities.Pizza;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer> {
}