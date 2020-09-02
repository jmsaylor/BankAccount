package com.johnmsaylor;

import java.text.NumberFormat;

public class Investment extends Account {
    public int riskCategory;
    public Investment(int initialDeposit, int owner, int riskCategory) {
        super(initialDeposit, owner);
        this.riskCategory = riskCategory;
    }

    public float calculateChange(float pastValue) {
        float currentValue = this.getBalance();
        float change = (currentValue / pastValue) - 1;
        change = change < 0 ? (change * -1) : change;
        return change;
    }
}
