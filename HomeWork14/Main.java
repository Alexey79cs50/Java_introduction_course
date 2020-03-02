package HomeWork14;

//      1. Создайте класс, в которому будут 3 отдельных метода, логика которых будет вызывать 3 разные “проверяемые”
//      (checked) ошибки. Ошибки можете вызвать принудительно в ходе какой-то логики(не принципиально);
//      2. Создайте еще один класс, у которого будет также три промежуточных метода, которые просто будут вызывать
//      по одному методу первого класса. Эти методы не должны обрабатывать возможные ошибки, а просто пробрасывают
//      полученную ошибку выше;
//      3. Используя методы второго класса(промежуточного), в классе Main реализуйте методы использования следующих
//      конструкций обработки ошибок:
//        а). try-catch-finally;
//        б). try-catch-catch-finally;
//        в). try-catch-catch-catch-finally;
//        г). try(with resources)-catch-finally;
//        д). try-finally;
//        (в каждой конструкции try должны быть вызовы 3х методов промежуточного класса с разными ошибками).

import java.io.FileNotFoundException;
import java.io.StreamCorruptedException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, StreamCorruptedException, ClassNotFoundException {

//   а). try-catch-finally;
//        methodA();
//   б). try-catch-catch-finally;
//        methodB();
//   в). try-catch-catch-catch-finally;
//        methodV();
//   г). try(with resources)-catch-finally;
//        methodG();
//   д). try-finally;
//        methodD();
    }

    private static void methodD() throws FileNotFoundException, ClassNotFoundException, StreamCorruptedException {
        try {
            new IntermediateClass().callFile();
            new IntermediateClass().callClass();
            new IntermediateClass().callStream();
        } finally {
            System.out.println("Will run anyway");
        }
    }

    public static void methodG() {
        try (IntermediateClass error = new IntermediateClass()) {
            new IntermediateClass().callFile();
            new IntermediateClass().callClass();
            new IntermediateClass().callStream();
        } catch (Exception e) {
            System.out.println("Error happened!");
            e.printStackTrace();
        } finally {
            System.out.println("Will run anyway");
        }
    }

    private static void methodV() {
        try {
            new IntermediateClass().callFile();
            new IntermediateClass().callClass();
            new IntermediateClass().callStream();
        } catch (FileNotFoundException e) {
            System.out.println("File error happened!");
            e.printStackTrace();
        } catch (StreamCorruptedException e) {
            System.out.println("Stream error happened!");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Class error happened!");
            e.printStackTrace();
        } finally {
            System.out.println("Will run anyway");
        }
    }

    private static void methodB() {
        try {
            new IntermediateClass().callFile();
            new IntermediateClass().callClass();
            new IntermediateClass().callStream();
        } catch (FileNotFoundException | ClassNotFoundException e) {
            System.out.println("The first catch error happened!");
            e.printStackTrace();
        } catch (StreamCorruptedException e) {
            System.out.println("The second catch error happened!");
            e.printStackTrace();
        } finally {
            System.out.println("Will run anyway");
        }
    }

    private static void methodA() {
        try {
            new IntermediateClass().callFile();
            new IntermediateClass().callClass();
            new IntermediateClass().callStream();
        } catch (FileNotFoundException | ClassNotFoundException | StreamCorruptedException e) {
            System.out.println("Error happened!");
            e.printStackTrace();
        } finally {
            System.out.println("Will run anyway");
        }
    }
}
