package com.techelevator.application;

import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

public class VendingMachine 
{
    public void run()
    {
        while(true)
        {
            UserOutput.displayHomeScreen();
            String choice = UserInput.getHomeScreenOption();

            if(choice.equals("display"))
            {
                System.out.println("Vending Machine Choices");
                // display the vending machine slots
            }
            else if(choice.equals("purchase"))
            {
                purchaseMenu();
                // make a purchase
            }
            else if(choice.equals("exit"))
            {
                // good bye
                break;
            }
        }
    }

    public static void purchaseMenu() {
        boolean stay = true;
        while(stay) {
            UserOutput.displayLevelPurchaseOptions();
            String choice = UserInput.getPurchaseChoice();

            System.out.println("Name of item?");

            if(choice.equals("Feed Money")) {

            } else if(choice.equals("Select Item")) {

            } else if(choice.equals("Finish Transaction")) {

            }

        }
    }
    
}
