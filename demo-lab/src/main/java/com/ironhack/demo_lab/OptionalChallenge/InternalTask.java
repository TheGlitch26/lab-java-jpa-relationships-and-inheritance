package com.ironhack.demo_lab.OptionalChallenge;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("INTERNAL")
public class InternalTask extends Task {
    public InternalTask() {
    }
}
