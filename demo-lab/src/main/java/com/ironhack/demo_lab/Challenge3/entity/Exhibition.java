package com.ironhack.demo_lab.Challenge3.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "exhibitions")
public class Exhibition extends Event {

    @Column(nullable = false, length = 100)
    private String destination;

    public Exhibition() {
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
