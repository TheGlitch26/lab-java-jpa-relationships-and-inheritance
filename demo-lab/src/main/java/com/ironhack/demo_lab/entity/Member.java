package com.ironhack.demo_lab.entity;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "members")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 10)
    private MemberStatus status;

    @Column(name = "renewal_date")
    private LocalDate renewalDate;

    @ManyToOne
    @JoinColumn(name = "division_id", nullable = false)
    private Division division;

    @PrePersist
    public void onCreate() {
        this.renewalDate = LocalDate.now();
    }

    public Member() {
    }

    public Member(String name, MemberStatus status, Division division) {
        this.name = name;
        this.status = status;
        this.division = division;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(LocalDate renewalDate) {
        this.renewalDate = renewalDate;
    }

    public MemberStatus getStatus() {
        return status;
    }

    public void setStatus(MemberStatus status) {
        this.status = status;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }
}
