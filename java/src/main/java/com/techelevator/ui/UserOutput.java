package com.techelevator.ui;

import com.techelevator.application.Funds;

import java.math.BigDecimal;
import java.util.Map;


/**
 * Responsibilities: This class should handle formatting and displaying ALL
 * messages to the user
 * 
 * Dependencies: None
 */
public class UserOutput
{

    public static void displayMessage(String message)
    {
        System.out.println();
        System.out.println(message);
        System.out.println();
    }

    public static void displayHomeScreen()
    {
        System.out.println();
        System.out.println("***************************************************");
        System.out.println("                      Home");
        System.out.println("***************************************************");
        System.out.println();
    }



    public static void displayLevelPurchaseOptions() {
        System.out.println("M ) Feed money");
        System.out.println("S ) Select items");
        System.out.println("F ) Finish Transaction");
        System.out.println();

    }

}
