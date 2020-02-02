package com.company;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Validators {
    public static String getString(String inputType) throws IOException {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("Please enter the car " + inputType + ": ");
            String userInput = input.next();
            specialCommands(userInput); //check if input matches to pre-defined command
            String[] arrayForCheck = arrayForCheck(inputType); //return items array for check
            //checks input vs array items
            for (String item: arrayForCheck){
                if (userInput.equalsIgnoreCase(item)) return item;
            }
            //hint on wrong input
            System.out.println("Available options: " + Arrays.toString(arrayForCheck));
        }
    }
    public static String getPlate(){
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter the car plate number: ");
            String userInput = input.nextLine();
            specialCommands(userInput); //check if input matches to pre-defined command
            //sample old: 11 011-21KK, new: AA 1234 KP
            String plate = userInput.replace("-", "");
            plate = plate.replace(" ", "");
            if (plate.length() == 8 || plate.length() == 9) return plate.toUpperCase();
            System.out.println("Unrecognizable format. Must be 1234567AA or AA1234AA");
        }
    }
    public static int getYear(){
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("Car production year: ");
            if (input.hasNextInt()){
                int year = input.nextInt();
                int currentYear = LocalDate.now().getYear(); //get current year
                if (year >= 1970 && year <= currentYear){
                    return year;
                } else {
                    System.out.println("Year must be in the range 1970 to " + currentYear);
                }
            } else {
                String userInput = input.next();
                specialCommands(userInput); //check if input matches to pre-defined command
                System.out.println("Unrecognizable format");
            }
        }
    }
    public static String generateID() throws IOException {
        Random random = new Random();
        String orderID = Integer.toString (10000 + random.nextInt(89999));
        if (orderCheck(orderID)) generateID();
        return orderID;
    }
    public static boolean orderCheck(String order) throws IOException {
        String path = "./src/com/company/resources/orders.csv";
        FileReader ordersFile = new FileReader(path);
        Scanner openOrders = new Scanner(ordersFile);

        while (openOrders.hasNextLine()) {
            if (order.equals(openOrders.nextLine().substring(1, 6))){
                ordersFile.close();
                openOrders.close();
                return true;
            }
        }
        ordersFile.close();
        openOrders.close();
        return false;
    }
    public static void specialCommands(String userText){
        if (userText.equalsIgnoreCase("exit")) System.exit(0);
    }
    //fixed arrays were replaced by reading data from the file to array. Old code below the method
    //don't like how it looks:
    private static String[] arrayForCheck(String arrayType) throws IOException {
        int index = 0;
        String path = "./src/com/company/resources/" + arrayType +".csv";
        FileReader ordersFile = new FileReader(path);
        Scanner csvItem = new Scanner(ordersFile);
        //just to get number of items in csv
        while (csvItem.hasNextLine()){
            String line = csvItem.nextLine();
            index += 1;
        }
        ordersFile.close();
        csvItem.close();

        //fill in array
        ordersFile = new FileReader(path);
        csvItem = new Scanner(ordersFile);
        String[] items = new String[index - 1];
        index = 0;
        while (csvItem.hasNextLine()){
            String line = csvItem.nextLine();
            index += 1;
            if(index != 1) items[index - 2] = line.substring(1, line.length() - 1);
        }
        ordersFile.close();
        csvItem.close();

        return items;
    }
/* old version - based on fixed arrays
    private static String[] arrayForCheck(String arrayType){
        String[] items;
        switch (arrayType){
            case "brand":
                items = new String[]{"Ford", "Hyundai", "Opel", "Reno", "Audi", "BMW"};
                return items;
            case "model":
                items = new String[]{"Kuga", "Sonata", "Astra", "Clio", "A4", "X5"};
                return items;
            case "colour":
                items = new String[]{"Red", "Green", "Blue", "Black", "White"};
                return items;
        }
        return new String[]{"Dummy"}; //will not happen due to fixed cases list
    }*/
}

