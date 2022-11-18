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
        double changeDue = dispenseChange;
        double change;
      change = Math.ceil(dispenseChange*100);

      dollaDollaBill = Math.round((int)change/100);
      change = change % 100;

      int quarters = Math.round((int)change/25);
      change = change % 25;

      int dimes = Math.round((int) change/10);
      change = change % 10;

      int nickels = Math.round((int) change/5);
      change %= 5;

      int pennies = Math.round((int) change/1);

        System.out.println("Your Change  "+"Dollars: $"+ dollaDollaBill + " | Quarters: " + quarters + " | Dimes: " + dimes + "| Nickels: " + nickels + " | Pennies " + pennies);

//        dispenseChange  = dispenseChange % 100;

        return funds;
    }



}
