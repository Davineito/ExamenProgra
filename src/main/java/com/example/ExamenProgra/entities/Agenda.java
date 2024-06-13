package com.example.ExamenProgra.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "agenda")
public class Agenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String agenda;
    private Long año;
    @Column(name ="created_at")
    @Temporal(TemporalType.DATE)
    private Date createdAt;
//obtenedores

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAgenda() {
        return agenda;
    }

    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getAño() {
        return año;
    }

    public void setAño(Long año) {
        this.año = año;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}