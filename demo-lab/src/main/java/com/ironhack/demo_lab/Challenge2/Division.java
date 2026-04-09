package com.ironhack.demo_lab.Challenge2;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "divisions")
public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(length = 100)
    private String district;

    @OneToOne
    @JoinColumn(name = "president_id")
    private Member president;

    @OneToMany(mappedBy = "division", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Member> members = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "association_id", nullable = false)
    private Association association;

    public Division() {
    }

    public Division(Member president, String district, String name, Association association) {
        this.president = president;
        this.district = district;
        this.name = name;
        this.association = association;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Member getPresident() {
        return president;
    }

    public void setPresident(Member president) {
        this.president = president;
    }

    public Association getAssociation() {
        return association;
    }

    public void setAssociation(Association association) {
        this.association = association;
    }
}
