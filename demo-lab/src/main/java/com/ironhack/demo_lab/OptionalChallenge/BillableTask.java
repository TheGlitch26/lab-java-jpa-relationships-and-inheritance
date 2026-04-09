package com.ironhack.demo_lab.OptionalChallenge;


import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.math.BigDecimal;

@Entity
@DiscriminatorValue("BILLABLE")
public class BillableTask extends Task {

    @Column(name = "hourly_rate")
    private BigDecimal hourlyRate;

    public BillableTask() {
    }

    public BigDecimal getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(BigDecimal hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
