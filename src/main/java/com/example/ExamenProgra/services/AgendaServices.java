package com.example.ExamenProgra.services;

import com.example.ExamenProgra.entities.Agenda;

import java.util.List;

public interface AgendaServices {

    public List<Agenda> findAll();
    public Agenda findById(Long Id);
    public void create(Agenda agenda);
    public void update(Long id, Agenda agenda);
    public void delate(Long id);
}
