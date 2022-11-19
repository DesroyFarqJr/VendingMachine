package com.techelevator.application;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FundsTest {


    @Test
    public void getFundsWorksCorrectly() {

        Funds funds = new Funds();

        double expectedResult = 0.0;

        double actualResult = funds.getFunds();


        Assert.assertEquals(expectedResult, actualResult, 0.0);



    }

    @Test
    public void addFundsWorksCorrectly() {
        Funds funds = new Funds();
        double inputA = 5;
        double expectedResult = 5;

        double actualResult = funds.addFunds((inputA));

        Assert.assertEquals(expectedResult, actualResult, 0.0);



    }

    @Test
    public void subtract() {
        Funds funds = new Funds();
        double inputA = 5.0;
        double expectedResult = -5.0;

        double actualResult = funds.subtract(inputA);

        Assert.assertEquals(expectedResult, actualResult, 0.0);


    }



    }

