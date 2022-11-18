package com.techelevator.application;

public class Funds {

    private double funds;
    private int dollaDollaBill;
    private int quarters;
    private int dimes;
    private int nickels;
    private int pennies;

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

    public double subtract (double subtractFunds) {
        this.funds = funds - subtractFunds;
        return funds;

    }

    public double getChange (double dispenseChange) {

        return funds;
    }



}
