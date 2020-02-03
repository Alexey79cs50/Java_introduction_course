package HomeWork6;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("-".repeat(20) + "1st task: strings" + "-".repeat(20));
        //        1. Дана строка: “ Hillel is my feature. I will be developer   ”
        String textForWork = " Hillel is my feature. I will be developer   ";
//        Необходимо выполнить следующие действия:
//        о Проверить не пустой ли заданный текст;
        System.out.println("Empty check: " + textForWork.isEmpty());
//        о Вывести длину данного текста;
        System.out.println("String length: " + textForWork.length());
//        о Вывести длину данного текста убрав лишние пробелы вначале и конце текста;
        System.out.println("Length after trim: " + textForWork.trim().length());
//        о Используя команду получения значения из строки по индексу вывести “I”;
        System.out.println("Character with 23rd index: " + textForWork.charAt(23));
//        о Используя команду обрезания вывести “developer”;
        System.out.println("Substring extracts word: |" + textForWork.substring(33, 42) + "|");
//        о Добавить в конце строки знак “!”;
        System.out.println("Now with ! at the end:" + textForWork.concat("!"));
//        о Выполните сравнение заданной строки со строкой: “Hillel is my feature. I will be DEVELOPER” так,
        String textCompareTo = "Hillel is my feature. I will be DEVELOPER";
//        чтобы в одном случае они были равны, а в другом не равны;
        System.out.println("Strings are equal: " + textForWork.trim().equalsIgnoreCase(textCompareTo));
        System.out.println("Strings not equal: " + (textForWork.trim() == textCompareTo));
//        о Выведите данную строку в нижнем регистре;
        System.out.println("Lower case: " + textCompareTo.toLowerCase());
//        о Выведите данную строку в верхнем регистре;
        System.out.println("Upper case: " + textCompareTo.toUpperCase());

//        2. Используя таблицу Unicode напечатайте 5 “необычных” символов, выберите из отпраленной таблицы символов;
        System.out.println("-".repeat(20) + "2nd task: symbols" + "-".repeat(20));
        System.out.println("Funny symbols: " + (char) 9773 + " " + (char) 9969 + " " + (char) 1132 + " " + (char) 3124 + " " + (char) 9760);

//        3. Необходимо записать любое четверостишие в файл и считать.Условия:
//        о Директории, в которую будет запись файла, может изначально не существовать. Необходимо это учесть;
//        о Файл соответственно должен создаваться при записи;
//        о После записи необходимо проверить все ли записалось и вывести сообщение об успешной записи,

        System.out.println("-".repeat(20) + "3rd task: file write & read" + "-".repeat(20));

        String path = "./src/Resources/text.txt";
        Path dirPath = Paths.get(path); //gets path
        if (!Files.exists(dirPath.getParent())) { //to create file if not exists
            Files.createDirectories((dirPath.getParent()));
        }
        FileWriter textFile = new FileWriter(path);
        String textWrite = "Бывает - проснешься, как птица,\n" +
                "крылатой пружиной на взводе,\n" +
                "и хочется жить и трудиться,\n" +
                "но к завтраку это проходит.";
        textFile.write(textWrite);
        textFile.close();
        File fileCheck = new File(path);
        if (fileCheck.exists()) {
            byte[] symbols = textWrite.getBytes();
            double bytes = fileCheck.length();
            if (symbols.length == bytes){
                System.out.println("File successfully created");
            } else {
                System.out.println("File exists, but content not matching");
            }
        } else {
            System.out.println("File not found");
        }

//        о В завершение необходимо считать стих из созданного файла и вывести в консоль.
        FileReader readFile = new FileReader(path);
        Scanner scan = new Scanner(readFile);
        while (scan.hasNextLine()) System.out.println(scan.nextLine());
        readFile.close();
        scan.close();

//        4. Написать программу “registration”. Условия:
//        о При запуске, программа должна просить задать логин и пароль;
//        о Поле пароль необходимо запросить 2 раза для правильного ввода;
//        о В случае несовпадения паролей, программа должна выводить сообщение о не соответствии паролей и выходить.
//        о В случае, если все указано верно, то данный (логин и пароль) должны записать в файл users.txt
//        (где будут храниться все данные про пользователей);
        System.out.println("-".repeat(20) + "4th task: registration" + "-".repeat(20));
        newUserLogin();

//        5. Написать программу “login”. Условия:
//        о При запуске программ должна просить ввести данные для входа: логин и пароль;
//        о Сверку данных проводить из того же файла users.txt. Если пользователь с введенными логином и паролем есть,
//        то выводить сообщение-приветствие. Если нет - то просить ввести повторно.
//        о Если 3 попытки ввода логина и пароля были неуспешны, то выводить сообщение о просьбе повторить позже и
//        останавливать программу.
        System.out.println("-".repeat(20) + "5th task: login" + "-".repeat(20));
        existingUserLogin();
    }

    private static void newUserLogin() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter login: ");
        String newName = scanner.next();
        System.out.print("Enter password: ");
        String newPassword = scanner.next();
        System.out.print("Confirm password: ");
        String newPasswordConfirm = scanner.next();
        if (newPassword.equals(newPasswordConfirm)) {
            System.out.println(newName + " registration successful");
            saveNewUser(newName, newPassword);
        } else {
            System.out.println("Passwords not matching. Try again later");
        }
    }
    private static void existingUserLogin() throws IOException {
        int tries = 0;
        while (tries < 3) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter login: ");
            String login = input.next();
            System.out.print("Enter password: ");
            String password = input.next();
            tries += 1;
            if (userValidate(login, password)){
                tries = 3;
                System.out.println(login + " welcome!");
            } else if (tries < 3){
                System.out.println("Wrong login or password. Try again.");
            } else {
                System.out.println("Login failed. Try later");
            }
        }
    }
    private static boolean userValidate(String user, String password) throws IOException {
        String userInput = user + "," + password;
        String path = "./src/Resources/user.txt";
        FileReader readFile = new FileReader(path);
        Scanner scan = new Scanner(readFile);
        while (scan.hasNextLine()){
            if (userInput.equals(scan.nextLine())){
                readFile.close();
                scan.close();
                return true;
            }
        }
        readFile.close();
        scan.close();
        return false;
    }
    private static void saveNewUser(String user, String password) throws IOException {
        String path = "./src/Resources/user.txt";
        Path dirPath = Paths.get(path); //gets path
        if (!Files.exists(dirPath.getParent())) { //to create file if not exists
            Files.createDirectories((dirPath.getParent()));
        }
        FileWriter textFile = new FileWriter(path, true);
        textFile.write(user + "," + password + "\n");
        textFile.close();
    }
}
