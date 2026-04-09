package com.ironhack.demo_lab.Challenge1;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Name {

    @Column(length = 10, name = "salutation")
    private String salutation;

    @Column(length = 100, nullable = false, name = "first_name")
    private String firstName;

    @Column(length = 100, name = "middle_name")
    private String middleName;

    @Column(length = 100, name = "last_name", nullable = false)
    private String lastName;

    public Name() {
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
