package com.techelevator.application;

import com.techelevator.models.ItemInfo;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VendingMachine 
{

    private static List<ItemInfo> itemList = new ArrayList<>();
        public void loadFile() {
        File file = new File("catering.csv");

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] itemArr = line.split("\\,");
                ItemInfo itemInfo = new ItemInfo(itemArr[0], itemArr[1], Double.parseDouble(itemArr[2]), itemArr[3]);
                itemList.add(itemInfo);
                System.out.println(Arrays.toString(itemArr));



            }

        } catch (FileNotFoundException e) {
            System.out.println("Problem with file");
        }
    }



    public void run()
    {   loadFile();

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

