package com.techelevator.application;

import java.awt.*;
import java.math.BigDecimal;

public class Candy implements Items {
    private String name;
    private BigDecimal price;
    private String slot;


    public Candy() {
        name = "Jolly Rancher";
        price = new BigDecimal("0.55");
        slot = "A1";


    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String getItemName() {
        return null;
    }

    @Override
    public BigDecimal getItemPrice() {
        return null;
    }

    @Override
    public String getSlot() {
        return slot;
    }
}
