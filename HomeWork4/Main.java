package HomeWork4;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        1. Вывести на экран числа от 1 до 10 используя while.
//        Пример: 1 2 3 4 5 6 7 8 9 10
//        Реализовать в отдельном методе.
        System.out.println("Task 1 output:");

        printUsingWhile();

//        2. Вывести на экран числа от 1 до 10 используя for.
//        Пример: 1 2 3 4 5 6 7 8 9 10
//        Реализовать в отдельном методе.
        System.out.println("Task 2 output:");

        printUsingFor();

//        3. Вывести на экран числа в порядке уменьшения от 100 до 0 с шагом в 10 единиц. Использовать while.
//        Пример: 100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 0
//        Реализовать в отдельном методе.
        System.out.println("Task 3 output:");

        printUseWhileStepTen();

//        4. Вывести на экран числа в порядке уменьшения от 100 до 0 с шагом в 10 единиц. Использовать for.
//        Пример: 100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 0
//        Реализовать в отдельном методе.
        System.out.println("Task 4 output:");

        printUseForStepTen();

//        5. Дано 10 чисел (возможно массив). Напечатайте наибольшее из них в консоль, используя циклические и условные операторы.

        //10 elements array creation. Filled in by random numbers in the range of 0 to 100.
        int[] array = new int[10];
        for (int i = 0; i < 10; i++){
            Random random = new Random();
            array[i] = random.nextInt(100);
        }

        System.out.println("Task 5 & 6 output:");
        System.out.println("Array of random numbers created: " + Arrays.toString(array));

        //max element find
        int maxNum = array[0];
        for (int i = 0; i < 10; i++) {
            if (maxNum < array[i]){
                maxNum = array[i];
            }
        }
        System.out.println(maxNum);

//        6. Дано 10 чисел (возможно массив). Напечатайте наименьшее из них в консоль, используя циклические и условные операторы.

        //min element find
        int minNum = array[0];
        for (int i = 0; i < 10; i++) {
            if (minNum > array[i]){
                minNum = array[i];
            }
        }
        System.out.println(minNum);

//        7. Создайте переменную равную 5. Используя один из циклических оператор, напечатайте “Hillel the Best” пока
//        созданная переменная меньше 0. Текст необходимо чтобы вывелся только один раз.

        System.out.println("Task 7 output:");

        int index = 5;
        while (index > -2) {
            if (index < 0) {
                System.out.println("Hillel the Best");
            }
            index--;
        }

//        8. Создайте массив из 10 чисел от 1 до 10. В одном из циклических операторов пройдетесь по нему и выведете следующие сообщения:
//        о Если четное - “{число} - это четно число”
//        о Если не четное - “{число} - это число не четное”
//        Пример:
//        1 - не четное число
//        2- четное число

        //array creation and filling in
        int[] arrayTwo = new int[10];
        for (int i = 0; i < arrayTwo.length; i++){
            arrayTwo[i] = i + 1;
        }

        System.out.println("Task 8 output:");

        for (int i = 0; i < arrayTwo.length; i++){
            System.out.println(arrayTwo[i] + " - " + (arrayTwo[i] % 2 == 0 ? "" : "не ") + "четное число");
        }

    }

    private static void printUsingWhile(){
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    private static void printUsingFor(){
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }

    private static void printUseWhileStepTen(){
        int i = 100;
        while (i >= 0){
            System.out.println(i);
            i -= 10;
        }
    }

    private static void printUseForStepTen(){
        for (int i =100; i >= 0; i -= 10) {
            System.out.println(i);
        }
    }
}
