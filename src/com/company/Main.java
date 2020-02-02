package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        //start menu
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>\n(1) Add order\n(2) Review orders\n(3) Delete order\nPlease type option or \"exit\" to quit: ");
            String choice = input.next();
            switch (choice){
                case "1": {
                    createNewOrder();
                    break;
                }
                case "2": {
                    reviewOrders();
                    break;
                }
                case "3": {
                    deleteOrder();
                    break;
                }
                default:{
                    Validators.specialCommands(choice);
                    System.out.println("Invalid command");
                }
            }
        }
    }

    public static void createNewOrder() throws IOException {
        String brand = Validators.getString("brand");
        String model = Validators.getString("model");
        String colour = Validators.getString("colour");
        String regNum = Validators.getPlate();
        int year = Validators.getYear();
        String orderID = Validators.generateID();
        //pass data to Car class and newOrder object creation
        Car newOrder = new Car(orderID, brand, model,colour,regNum,year);
        //input confirmation
        if (!inputConfirmation(newOrder)) createNewOrder();
        addOrder(newOrder);
    }
    //input confirmation dialog
    private static boolean inputConfirmation(Car values){
        System.out.println( "------------------------" +
                "\nInformation entered:" +
                "\nBrand        | " + values.brand +
                "\nModel        | " + values.model +
                "\nColor        | " + values.colour +
                "\nPlate number | " + values.regNum +
                "\nYear         | " + values.year +
                "\n------------------------");
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Is it correct? (y/n): ");
            String confirmation = input.next().toUpperCase();
            Validators.specialCommands(confirmation);
            switch (confirmation) {
                case "Y": return true;
                case "N": return false;
                default: System.out.println("Invalid command");
            }
        }
    }
    private static void addOrder(Car newOrder) throws IOException {
        String path = "./src/com/company/resources/orders.csv";
        FileWriter ordersFile = new FileWriter(path, true);
        String toWrite = ("\"" + newOrder.orderID +
                            "\",\"" + newOrder.brand +
                            "\",\"" + newOrder.model +
                            "\",\"" + newOrder.colour +
                            "\",\"" + newOrder.regNum +
                            "\",\"" + newOrder.year + "\"\n");
        ordersFile.write(toWrite);
        ordersFile.close();
        System.out.println("Order created: " + newOrder.orderID);
    }
    private static void reviewOrders() throws IOException {
        String path = "./src/com/company/resources/orders.csv";
        FileReader ordersFile = new FileReader(path);
        Scanner orders = new Scanner(ordersFile);
        while (orders.hasNextLine()){
            System.out.println(formatCSV(orders.nextLine()));
        }
        ordersFile.close();
        orders.close();
    }
    private static void deleteOrder() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Order number to delete: ");
        String orderToDelete = input.next();
        //check if exists
        if(!Validators.orderCheck(orderToDelete)) {
            System.out.println("Order not found");
            return;
        }
        String path = "./src/com/company/resources/orders.csv";
        String tempPath = "./src/com/company/resources/orders_tmp.csv";
        FileReader ordersFile = new FileReader(path);
        Scanner orders = new Scanner(ordersFile);
        while (orders.hasNextLine()){
            String line = orders.nextLine();
            String orderInCurrentLine = line.substring(1, 6);
            if (!orderToDelete.equals(orderInCurrentLine)) addLine(line);
        }
        ordersFile.close();
        orders.close();

        //next 5 lines are wreid, but works
        Files.deleteIfExists(Paths.get(path));
        File workFile = new File(path);
        File tempFile = new File(tempPath);
        tempFile.renameTo(workFile);
        Files.deleteIfExists(Paths.get(tempPath));

        System.out.println(orderToDelete + " was removed");
    }
    //used in order deletion. Can't get it works, without moving these line to separate method
    private static void addLine(String line) throws IOException {
        String path = "./src/com/company/resources/orders_tmp.csv";
        Path dirPath = Paths.get(path); //gets path
        if (Files.exists(dirPath.getParent())){ //to create file if not exists
            Files.createDirectories((dirPath.getParent()));
        }
        FileWriter ordersFile = new FileWriter(path, true);
        ordersFile.write(line + "\n");
        ordersFile.close();
    }
    private static String formatCSV(String lineCsv) {
        String result;
        lineCsv = lineCsv.substring(1, lineCsv.length() - 1);
        String[] lineSplit = lineCsv.split("\",\"");
        result = lineSplit[0] +
                "  " + lineSplit[1] + " ".repeat(10 - lineSplit[1].length()) +
                "  " + lineSplit[2] + " ".repeat(10 - lineSplit[2].length()) +
                "  " + lineSplit[3] + " ".repeat(10 - lineSplit[3].length()) +
                "  " + lineSplit[4] + " ".repeat(12 - lineSplit[4].length()) +
                "  " + lineSplit[5] + " ".repeat(5 - lineSplit[5].length());
        return result;
    }
}
