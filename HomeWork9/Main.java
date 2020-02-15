package HomeWork9;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    //constant
    static final public String WORK_FILE = "./src/HomeWork9/data.txt";

    public static void main(String[] args) throws IOException {
        User user = new User();
        Support support = new Support();
        Admin admin = new Admin();

        //manual testing
        selection(support);

        //run menu for test
        //menu(user, support, admin);
    }

    private static void selection(User user) throws IOException {
        if (user instanceof Support) {
            System.out.print("Enter the text: ");
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();
            ((Support) user).check(text);
        } else if (user instanceof Admin) {
            System.out.print("Enter the text: ");
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();
            Support dummy = new Support();
            boolean status = dummy.check(text);
            ((Admin) user).check(status);
        } else {
            System.out.print("Enter the text: ");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
        }
    }

    private static void menu(User user, Support support, Admin admin) throws IOException {
        System.out.print("(1:User) (2:Support) (3: Admin) (4: Write to file) Type option number: ");
        Scanner select = new Scanner(System.in);
        switch (select.next()) {
            case "1":
                selection(user);
                break;
            case "2":
                selection(support);
                break;
            case "3":
                selection(admin);
                break;
            case "4":
                user.writer();
                break;
            default:
                System.out.println("Try again");
        }
    }

}
