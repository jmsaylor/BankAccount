package com.johnmsaylor;

import java.text.NumberFormat;

public class Investment extends Account {
    private String riskCategory;

    public Investment(float initialDeposit, Client client, String riskCategory) {
        super(initialDeposit, client);
        this.riskCategory = riskCategory;
    }

    public String calculateChange(float pastValue) {
//        NumberFormat nf = NumberFormat.getInstance(new Locale("en", "US"));
        NumberFormat nf = NumberFormat.getPercentInstance();
        nf.setMaximumFractionDigits(4);
        double currentValue = this.getBalance();
        double change = (currentValue / pastValue) - 1;
//        change = change < 0 ? -change : change;
        return nf.format(change);
    }

    public String getRiskCategory() {
        return riskCategory;
    }

}
