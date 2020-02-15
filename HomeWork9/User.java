package HomeWork9;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class User {
    private String name;
    private String surname;
    private String mail;
    private String password;
    private String gender;
    private String country;

    public User() {
    }

    public User(String name, String surname, String mail, String password, String gender, String country) {
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.password = password;
        this.gender = gender;
        this.country = country;
    }

    final public void read(String textInput) {
        System.out.println("Text received: " + textInput);
    }

    public void writer() throws IOException {
        Path dirPath = Paths.get(Main.WORK_FILE);
        if (!Files.exists(dirPath.getParent())) {
            Files.createDirectories(dirPath.getParent());
        }
        FileWriter file = new FileWriter(Main.WORK_FILE, true);
        System.out.print("Enter text: ");
        Scanner scanner = new Scanner(System.in);
        file.write(scanner.nextLine() + "\n");
        scanner.close();
        file.close();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
