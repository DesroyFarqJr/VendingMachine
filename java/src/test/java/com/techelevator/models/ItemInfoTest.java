package com.techelevator.models;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemInfoTest {

    @Test
    public void doesItemInfoConstructorWork () {

        ItemInfo itemInfo = new ItemInfo("C4", "Snyckers", 1.50, "Candy");

        Assert.assertEquals("C4", itemInfo.getSlot());
        Assert.assertEquals("Snyckers", itemInfo.getName());
        Assert.assertEquals(1.50, itemInfo.getPrice(), 0.0);
        Assert.assertEquals("Candy", itemInfo.getItemType());

    }



    @Test
    public void getRemainingAmount() {
        ItemInfo getRemaining = new ItemInfo("A1", "Snyckers", 1.50, "Candy");

        Assert.assertEquals(6, getRemaining.getRemainingAmount());



    }

    @Test
    public void testToString() {
        ItemInfo testToStringTest = new ItemInfo("A1", "Snyckers", 1.50, "Candy");

        Assert.assertEquals("ItemInfo{" + "slot:" + testToStringTest.getSlot() +
                "  name:'" + testToStringTest.getName() + '\'' +
                ", price:" + testToStringTest.getPrice() +
                ", remainingAmount:" + testToStringTest.getRemainingAmount() +
                '}', testToStringTest.toString());

        testToStringTest.setRemainingAmount(0);

        Assert.assertEquals("NO LONGER AVAILABLE", testToStringTest.toString());



    }

}
