package HomeWork3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        1. Используя класс Scanner, написать программу, которая будет запрашивать пользователя ввести данные о себе
//        для регистрации и после введенных данных будет выводить всю информацию в консоль:
//        o Введите Ваше имя:
//        о Введите Вашу фамилию:
//        о Укажите сколько Вам полных лет:
//        о Введите Вашу почту для регистрации:
//        о Напишите несколько слов о себе:
//        ps: Можно оформить как в классе Main, так и в отдельном методе или классе. При этом надо показать как вы
//        будете вызывать данных класс или метод.
        UserData.user();

//        2. Создайте 3 переменные типа int и 3 переменные типа double используя класс Random,
//        выполните их сложение и выведите результат.

        Random random = new Random();
        int rndIntOne = random.nextInt();
        int rndIntTwo = random.nextInt();
        int rndIntThree = random.nextInt();
        double rndDblOne = random.nextDouble();
        double rndDblTwo = random.nextDouble();
        double rndDblThree = random.nextDouble();
        System.out.println(rndIntOne + rndIntTwo + rndIntThree + rndDblOne + rndDblTwo + rndDblThree);

        System.out.println();

//        3. Создать метод, для розыгрыша приза в лотерее среди участников. Внутри метода сделать возможным каждый
//        раз при вызове вводить количество участников(При запуске программы должно спрашивать количество
//        участников(использовать Scanner), вы задаете количество участников и среди них производится розыгрыш).
//        Используя класс Random определить победителя и вывести поздравление в консоль.
//        У данного метода не будет принимаемых параметров и может быть, может не быть возвращаемый параметр
//        с результатом победителя(зависит от того как вы реализуете).
        winner();

//        4. Используя класс Math напишите 7-8 примеров вызовов вспомогательных методов данного класса:
//        о sqrt();
//        o abs();
//        o min();
//        o max();
//        o random();
//        o ….(остальные на Ваш выбор);

        //System.out.print was not asked, but made for easier check
        System.out.println(Math.sqrt(25));
        System.out.println(Math.abs(-37));
        System.out.println(Math.min(5, 7));
        System.out.println(Math.max(25, 16));
        System.out.println(Math.random());
        System.out.println(Math.log(56));
        System.out.println(Math.round(45.5555555));
        System.out.println(Math.PI);

        System.out.println();

//        5. Создать 2 схожих метода, которые будут случайным образом генерировать Вашу зарплату. Обратите внимание,
//        что именно метода, а не просто вызовы указанных функций. В одном методе используйте класс Random,
//        в другом Math.random. Для себя поймите разницу в использовании. Если не хотите получать маленькую зарплату,
//        то можете выполнить дополнительные действия с Math.random)

        System.out.println("Method one salary: " + salaryOne());
        System.out.println("Method two salary: " + salaryTwo());

        System.out.println();

//        6. Создайте класс “Employee”, у которого будет три переменные: double:“salary”, String:“position”, int:”age”.
//        Выполните определенные действия, чтобы сравнение сотрудников производилось не по ссылке, а по значению полей.
//        В классе Main создайте 2 одинаковых сотрудника и выполните сравнения используя “==” и “equals()”.

        Employee bob = new Employee();
        bob.salary = 30000;
        bob.position = "Accountant";
        bob.age = 25;

        Employee mike = new Employee();
        mike.salary = 30000;
        mike.position = "Accountant";
        mike.age = 25;

        System.out.println(mike == bob);
        System.out.println(mike.equals(bob));

        System.out.println();

//        7. Создайте свой математический класс(наподобие Math) для помощи в дальнейших вычислениях.
//                Внутри нового класса создать 4 новых метода, 2 статических (static) и 2 обычных.
//                Этих 4 метода должны выполнять 4 математических операции (сложение(+), вычитание(-), деление(/), умножение(*)).
//        Все методы должны возвращать результат выполненной операции обратно.
//        Необходимо чтобы 2 метода принимали и возвращали целочисленные значения, а 2 - дробные значения.
//                В классе Main реализуйте вызовы созданных Вами новых методов. Запомните отличие вызовов статических и не
//                статических методов.

        System.out.println(MyMath.plus(5,7));
        System.out.println(MyMath.minus(15,7));

        MyMath calculation = new MyMath();
        System.out.println(calculation.divide(45.5, 25.25));
        System.out.println(calculation.multiply(2.5,10.9));
    }

    private static void winner(){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Количество участников: ");
        int participants = userInput.nextInt();
        Random random = new Random();
        System.out.println("Победитель участник :" + (random.nextInt(participants) + 1));
        System.out.println();
    }

    private static int salaryOne(){
        Random random = new Random();
        return random.nextInt(5000) + 5000;
    }

    private static int salaryTwo(){
        return (int) (Math.random() * 5000) + 5000;
    }
}
