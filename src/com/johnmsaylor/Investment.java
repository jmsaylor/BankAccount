package com.johnmsaylor;

import java.text.NumberFormat;

public class Investment extends Account {
    public int getRiskCategory() {
        return riskCategory;
    }

    private int riskCategory;

    public Investment(float initialDeposit, int owner, int riskCategory) {
        super(initialDeposit, owner);
        this.riskCategory = riskCategory;
    }

    public String calculateChange(float pastValue) {
//        NumberFormat nf = NumberFormat.getInstance(new Locale("en", "US"));
        NumberFormat nf = NumberFormat.getPercentInstance();
        nf.setMaximumFractionDigits(4);
        float currentValue = this.getBalance();
        float change = (currentValue / pastValue) - 1;
//        change = change < 0 ? -change : change;
        return nf.format(change);
    }


}
