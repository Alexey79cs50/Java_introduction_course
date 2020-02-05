package HomeWork7;

public class Main {
    public static void main(String[] args) {
//        1. Задача на работу с классом/объектами:
//        о Создайте 2 Класса: Cat & Dog;
//        о У каждого класса задайте по 3 параметра;
//        о Создайте конструкторы без параметров, с 1, 2 и 3 параметрами;
//        о Важно: Имена параметров классов и входящих параметров в конструкторах должны совпадать! (Используем this);
        //done in classes Cat & Dog
//        о Создайте объекты описанных классов, используя все заданные конструкторы, в классе Main;

        Cat cat = new Cat();
        Cat cat1 = new Cat("Bob");
        Cat cat2 = new Cat("Barsik", 11);
        Cat cat3 = new Cat("Zefirka", 5, 3.5);

        Dog dog = new Dog();
        Dog dog1 = new Dog("Rex");
        Dog dog2 = new Dog("Duke", 4);
        Dog dog3 = new Dog("Puff", 8, 5.7);

//        2. В классах Cat & Dog создайте для каждого из параметров два метода:
//        о Один метод должен записывать значение параметра (например: для name -> setName(String name));
//        о Второй метод должен возвращать значение необходимого параметра (например: для name -> getName());
//        о Для каждого параметра каждого класса должно быть 2 метода (1 set & 1 get);
        //done in classes Cat & Dog

//        3. После чего попробуйте в классе Main задать параметры и вывести их значение в консоль обращаясь напрямую
//        к параметрам и через созданные методы.

        //Setting and printing directly
        cat.name = "Kitty";
        cat.age = 2;
        cat.weight = 3.3;
        System.out.println("\nPrinting object " + cat +". Directly:");
        System.out.println(cat.name + "  Age: " +  cat.age + "  Weight: " + cat.weight);

        dog.name = "Muha";
        dog.age = 5;
        dog.weight = 8.5;
        System.out.println("\nPrinting object " + dog +". Directly:");
        System.out.println(dog.name + "  Age: " +  dog.age + "  Weight: " + dog.weight);

        //Setting and printing through methods
        cat.setName("Puffer");
        cat.setAge(6);
        cat.setWeight(8.1);
        System.out.println("\nPrinting object " + cat +". Through methods:");
        System.out.println(cat.getName() + "  Age: " +  cat.getAge() + "  Weight: " + cat.getWeight());

        dog.setName("Foxy");
        dog.setAge(11);
        dog.setWeight(2.4);
        System.out.println("\nPrinting object " + dog +". Through methods:");
        System.out.println(dog.getName() + "  Age: " +  dog.getAge() + "  Weight: " + dog.getWeight());
    }
}
