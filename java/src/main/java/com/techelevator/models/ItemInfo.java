package com.techelevator.models;

import java.math.BigDecimal;

public class ItemInfo {

    private String name;
    private Double price;
    private String slot;
    private String itemType;
    private int amountLeft;

    public ItemInfo(String slot, String name, Double price, String itemType) {
        this.name = name;
        this.price = price;
        this.slot = slot;
        this.itemType = itemType;
        this.amountLeft = 6;
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

    public int getRemainingAmount() {
        return amountLeft;
    }

    public void setRemainingAmount(int remainingAmount) {
        this.amountLeft = remainingAmount;
    }

    @Override
    public String toString() {
        String needRestock = "NO LONGER AVAILABLE";
        if (amountLeft == 0) {
            return needRestock;
        }
        return "ItemInfo{" + "slot:" + slot +
                "  name:'" + name + '\'' +
                ", price:" + price +
                ", remainingAmount:" + amountLeft +
                '}';

    }
}
