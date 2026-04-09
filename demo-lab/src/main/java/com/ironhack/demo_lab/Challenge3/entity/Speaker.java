package com.ironhack.demo_lab.Challenge3.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "speakers")
public class Speaker extends Participant {

    @Column
    private Integer presentationDuration;

    @ManyToOne
    @JoinColumn(name = "conference")
    private Conference conference;

    public Speaker() {
    }

    public Integer getPresentationDuration() {
        return presentationDuration;
    }

    public void setPresentationDuration(Integer presentationDuration) {
        this.presentationDuration = presentationDuration;
    }

    public Conference getConference() {
        return conference;
    }

    public void setConference(Conference conference) {
        this.conference = conference;
    }
}
