package com.example.ExamenProgra.dao;

import com.example.ExamenProgra.entities.Movement;
import org.springframework.data.repository.CrudRepository;

public interface MovementDao extends CrudRepository<Movement, Long> {
}
