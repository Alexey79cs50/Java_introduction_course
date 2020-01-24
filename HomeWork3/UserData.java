package HomeWork3;

import java.util.Scanner;

public class UserData {
    public static void user(){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите Ваше имя: ");
        String name = input.next();
        System.out.print("Введите Вашу фамилию: ");
        String surname = input.next();
        System.out.print("Укажите сколько Вам полных лет: ");
        int age = input.nextInt();
        System.out.print("Введите Вашу почту для регистрации: ");
        String mail = input.next();
        Scanner memo = new Scanner(System.in);
        System.out.print("Напишите несколько слов о себе: ");
        String print = memo.nextLine();

        System.out.println("------------------------------------------");
        System.out.println("Вы: " + name + " " + surname + ". Вам " + age + ".");
        System.out.println("Ваш адрес : " + mail);
        System.out.println("О себе: " + print);
        System.out.println();
    }
}
