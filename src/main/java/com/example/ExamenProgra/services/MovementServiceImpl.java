package com.example.ExamenProgra.services;

import com.example.ExamenProgra.dao.MovementDao;
import com.example.ExamenProgra.entities.Movement;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MovementServiceImpl implements MovementService{
    @Autowired
    MovementDao movementDao;

    @Override
    public List<Movement> findAll() {
        return (List<Movement>) movementDao.findAll();
    }

    @Override
    public Movement findById(Long Id) {
        return movementDao.findById(Id).orElse(null);
    }

    @Override
    public void create(Movement movement) {
        movementDao.save(movement);
    }

    @Override
    public void update(Long id, Movement movement) {
        if(movementDao.existsById(id)){
            movement.setUserid(id);
            movementDao.save(movement);
        }
    }

    @Override
    public void delate(Long id) {
        if(movementDao.existsById(id)){
            movementDao.deleteById(id);
        }
    }
}
