package com.ironhack.demo_lab.Challenge3.entity;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "conferences")
@PrimaryKeyJoinColumn(name = "id")
public class Conference extends Event {

    @Column(nullable = false, length = 100)
    private String topic;

    @OneToMany(mappedBy = "conference")
    private List<Speaker> speakers = new ArrayList<>();

    public Conference() {
    }

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
