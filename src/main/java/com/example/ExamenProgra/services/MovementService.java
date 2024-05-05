package com.example.ExamenProgra.services;

import com.example.ExamenProgra.entities.Movement;

import java.util.List;

public interface MovementService {
    public List<Movement> findAll();
    public Movement findById(Long Id);
    public void create(Movement movement);
    public void update(Long id,Movement movement);
    public void delate(Long id);
}
