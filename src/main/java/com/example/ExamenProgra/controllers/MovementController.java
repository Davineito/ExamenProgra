package com.example.ExamenProgra.controllers;

import com.example.ExamenProgra.entities.Movement;
import com.example.ExamenProgra.services.MovementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movement")
public class MovementController {
    @Autowired
    MovementService movementService;

    @GetMapping
    public List<Movement> GetAll() {
        return movementService.findAll();
    }
    @GetMapping(value="/{id}")
    public Movement GetById(@PathVariable Long id){
        return movementService.findById(id);
    }
    @PostMapping
    public void create(@RequestBody Movement movement){

        movementService.create(movement);
    }
    @PutMapping(value="/{id}")
    public void update (@PathVariable Long id,
                        @RequestBody Movement movement) {
        movementService.update(id, movement);
    }
    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Long id) {
        movementService.delate(id);
    }
}
