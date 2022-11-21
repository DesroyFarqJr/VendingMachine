package com.techelevator.application;

import com.techelevator.models.ItemInfo;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;

public class VendingMachine {

    Funds availableFunds = new Funds();
    private int purchaseCounter = 1;

    Logger logger = new Logger("Audit.txt");

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

//    for(each)
//    if(userinput . equals(each.getSlot())){
//        //subtract money
//        //make a sound
//        //reduce the stock
//    }

    public void run() {
        loadFile();

        logger.write("INITIALIZING");

        while (true) {
            UserOutput.displayHomeScreen();
            String choice = UserInput.getHomeScreenOption();

            if (choice.equals("display")) {
                System.out.println("Vending Machine Choices");
                displayMenu();


                // display the vending machine slots
            } else if (choice.equals("purchase")) {
                purchaseMenu();
                // make a purchase
            } else if (choice.equals("exit")) {
                // good bye
                break;
            }
        }
    }

    public void  returnToMainMenu() {
        while (true) {
            UserOutput.displayHomeScreen();
            String choice = UserInput.getHomeScreenOption();

            if (choice.equals("display")) {
                System.out.println("Vending Machine Choices");
                displayMenu();


                // display the vending machine slots
            } else if (choice.equals("purchase")) {
                purchaseMenu();
                // make a purchase
            } else if (choice.equals("exit")) {
                // good bye
                break;
            }
        }
    }

    public void purchaseMenu() {
        boolean stay = true;
        while (stay) {
            UserOutput.displayLevelPurchaseOptions();
            System.out.println("Available balance: $" + availableFunds.getFunds());
            String choice = UserInput.getPurchaseChoice();

            if (choice.equals("Feed Money")) {
                feedMoney();

            } else if (choice.equals("Select Item")) {

               selectItem();

            } else if (choice.equals("Finish Transaction")) {
                DecimalFormat dfZero = new DecimalFormat("0.00");
                double preTraFunds = availableFunds.getFunds();
                availableFunds.getChange(availableFunds.getFunds());
                availableFunds.setFunds(0);
                logger.write("CHANGE GIVEN:  $" + dfZero.format(preTraFunds) + "  $" +dfZero.format(availableFunds.getFunds()));
                returnToMainMenu();

            }

        }
    }

    public static void displayMenu() {

      // int remainingAmount = 6;

        for (int i = 0; i < itemList.size(); i++) {
        ItemInfo test = itemList.get(i);
        System.out.println(test.toString());
        }
    }

    public void feedMoney() {
        double preTraFunds = availableFunds.getFunds();
        availableFunds.addFunds(UserInput.insertCash());
        logger.write("MONEY FED:  $" + preTraFunds + "  $" + availableFunds.getFunds());

        purchaseMenu();
    }

    public void selectItem() {

        DecimalFormat dfZero = new DecimalFormat("0.00");

        String slotChoice = UserInput.itemSelector();
        double preTraFunds = availableFunds.getFunds();



        for(ItemInfo itemLoop : itemList  ) {
            if(slotChoice.equals(itemLoop.getSlot())) {
                if (itemLoop.getRemainingAmount() == 0) {
                    System.out.println("NO LONGER AVAILABLE");
                    purchaseMenu();
                }

                else if (itemLoop.getPrice() > availableFunds.getFunds()) {
                    System.out.println("Please add sufficient funds to purchase");
                    purchaseMenu();

                }
//write to log after purchase.
                else {

                    if(purchaseCounter%2 == 0) {
                        availableFunds.subtract(itemLoop.getPrice()-1.00);
                        System.out.println("DISCOUNT APPLIED");
                    }

                    else {
                        availableFunds.subtract(itemLoop.getPrice());
                    }
                    System.out.print(itemLoop.getName());
                    System.out.print(" $" + itemLoop.getPrice() + " ");

                    if (itemLoop.getItemType().equals("Munchy")){
                        System.out.println("Munchy, Munchy, so Good!");
                    }
                    else if (itemLoop.getItemType().equals("Candy")){
                        System.out.println("Sugar, Sugar, so Sweet!");
                    }
                    else if (itemLoop.getItemType().equals("Drink")) {
                        System.out.println("Drinky, Drinky, Slurp Slurp!");
                    }
                    else if(itemLoop.getItemType().equals("Gum")) {
                        System.out.println("Chewy, Chewy, Lots 'O Bubbles!");
                    }

                    itemLoop.setRemainingAmount(itemLoop.getRemainingAmount()-1);

                    purchaseCounter++;
                    //Take logger object - write message to its
                    //Date time apart of the logger method.
//                    System.out.println(itemLoop.getRemainingAmount());

                    logger.write(itemLoop.getName() + "  " + itemLoop.getSlot() + "  $" + dfZero.format(preTraFunds) + "  $" + dfZero.format(availableFunds.getFunds()));

                    purchaseMenu();


                }
            }

        }




       purchaseMenu();
    }


}
