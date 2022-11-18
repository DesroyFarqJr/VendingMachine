package com.techelevator.application;

public class Funds {

    private double funds;

    public Funds() {
        funds = 0.0;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }

    public double getFunds() {
        return funds;
    }

    public double addFunds(double addedFunds) {
        this.funds = funds + addedFunds;
        return funds;
    }
}
