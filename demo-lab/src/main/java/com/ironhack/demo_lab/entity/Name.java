package com.ironhack.demo_lab.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Name {

    @Column(length = 10, name = "salutation")
    private String salutation;

    @Column(length = 100, nullable = false)
    private String firstName;

    @Column(length = 100, name = "middle_name")
    private String middleName;

    @Column
}
