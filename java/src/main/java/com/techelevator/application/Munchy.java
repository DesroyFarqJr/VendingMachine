package com.techelevator.application;

import java.math.BigDecimal;

public class Munchy implements Items   {
    private String name;
    private BigDecimal price;


    public Munchy() {
        name = "Pringles";
        price = new BigDecimal("1.00");

    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String getItemName() {
        return name;
    }

    @Override
    public BigDecimal getItemPrice() {
        return price;
    }

    @Override
    public String getSlot() {
        return null;
    }
}

