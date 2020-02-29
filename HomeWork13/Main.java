package HomeWork13;

//      Задача 1:
//        Создайте программу-опросник(Можно вынести в отдельный класс с необходимым(и) методом(ами)).
//        Данная программа должна просить ввести пользователя свое имя, после чего проводить опрос(достаточно 2-3 вопроса).
//        Введенные данные сохраняются в виде ключ-значение, где ключ - это имя пользователя, а значение это данные в виде
//        тоже ключ-значение(где ключ - это вопрос, а значение - ответ).
//        Тип значения ответа на вопрос указать на свое усмотрение.
//        После проведенного опроса программа должна записать результат в файл.
//      Задача 2:
//        1. Создайте 3 класса, которые линейно наследуются друг от друга. Должна быть возможность создать экземпляр
//        класса каждого из наследников(подумайте какой тип класса должен быть).
//        2. В каждом из классов должно быть 3 поля(на свое усмотрение), которые имеют тип переменной List/Set/Map,
//        то есть будут по 1 переменной с типом List, Set и Map.(Зная принципы ООП будьте внимательны реализуя
//        переменные в классах!).
//        3. Далее зная про Wildcards реализуйте метод, который на вход будет принимать 2 List/Set/Map(На Ваше
//        усмотрение, не принципиально), один из которых будет разрешать передать всех наследников от среднего
//        класса(Вашего), второй - будет разрешать передать всех кто выше в наследовании от среднего класса(Вашего).
//        4. Логика внутри метода данного: заполнение из одной коллекции данными в другую коллекцию.

import java.io.IOException;
import java.util.*;

public class Main {

    static final public String WORK_FILE = "./src/HomeWork13/questionnaire.txt";

    public static void main(String[] args) throws IOException {
        //task 1
        Questionnaire questionnaire = new Questionnaire();
        questionnaire.run();
        questionnaire.save();

        //task 2
        ArrayList<Pine> pineList = new ArrayList<>();
        ArrayList<Plants> plantsList = new ArrayList<>();
        HashSet<Pine> pinesSet = new HashSet<>();
        HashSet<Plants> plantSet = new HashSet<>();

        copyOne(pineList, pinesSet);
        // copyOne(plantsList, plantSet); for self check - will not work

        copyTwo(plantsList, plantSet);
        // copyTwo(pineList, pinesSet); for self check - will not work

    }
    public static void copyOne(List<? extends Tree> names, Set<? extends Tree> regions) {
        ArrayList list = new ArrayList();
        list.addAll(regions);
        names.addAll(list);
    }
    public static void copyTwo(List<? super Tree> names, Set<? super Tree> regions) {
        ArrayList list = new ArrayList();
        list.addAll(regions);
        names.addAll(list);
    }
}
