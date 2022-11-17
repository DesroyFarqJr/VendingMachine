package com.techelevator.models;

import java.math.BigDecimal;

public class ItemInfo {

    private String name;
    private Double price;
    private String slot;
    private String itemType;

    public ItemInfo(String name, String slot, Double price, String itemType) {
        this.name = name;
        this.price = price;
        this.slot = slot;
        this.itemType = itemType;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getSlot() {
        return slot;
    }

    public String getItemType() {
        return itemType;
    }


}
