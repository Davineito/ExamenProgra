package com.example.ExamenProgra.controllers;

import com.example.ExamenProgra.entities.Agenda;
import com.example.ExamenProgra.services.AgendaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agenda")
public class AgendaController {

    @Autowired
    AgendaServices agendaServices;

    @GetMapping
    public List<Agenda> GetAll(){
        return agendaServices.findAll();
    }

    @GetMapping(value="/{id}")
    public Agenda GetById(@PathVariable Long id){
        return agendaServices.findById(id);
    }



    @PostMapping
    public void create( @RequestBody Agenda agenda){

        agendaServices.create(agenda);
    }

    @PutMapping(value="/{id}")
    public void update (@PathVariable Long id,
                        @RequestBody Agenda agenda){
        agendaServices.update(id, agenda);
    }


    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Long id){

        agendaServices.delate(id);
    }
}
