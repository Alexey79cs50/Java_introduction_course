package HomeWork9;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

final public class Support extends User {
    private String accessGroup;

    public Support() {
    }

    public Support(String name, String surname, String mail, String password, String gender, String country, String accessGroup) {
        super(name, surname, mail, password, gender, country);
        this.accessGroup = accessGroup;
    }

    public boolean check(String input) throws IOException {
        File check = new File(Main.WORK_FILE);
        if (!check.exists()) {
            System.out.println("File to check not found");
            return false;
        }
        FileReader file = new FileReader(Main.WORK_FILE);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            if (scanner.nextLine().equals(input)) {
                file.close();
                scanner.close();
                return true;
            }
        }
        file.close();
        scanner.close();
        return false;
    }

    public String getAccessGroup() {
        return accessGroup;
    }

    public void setAccessGroup(String accessGroup) {
        this.accessGroup = accessGroup;
    }
}
