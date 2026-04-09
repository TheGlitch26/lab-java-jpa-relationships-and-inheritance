package com.ironhack.demo_lab.Challenge3.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "guests")
public class Guest extends Participant {

    @Column
    @Enumerated(EnumType.STRING)
    private GuestStatus status = GuestStatus.NO_RESPONSE;

    @ManyToOne
    @JoinColumn(name = "event")
    private Event event;

    public Guest() {
    }

    public GuestStatus getStatus() {
        return status;
    }

    public void setStatus(GuestStatus status) {
        this.status = status;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
