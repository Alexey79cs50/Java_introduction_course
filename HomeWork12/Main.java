package HomeWork12;

//      Выполните все пункты как одно решение задачи:
//        1. Создайте 3 класса, в каждом из которых будет по одному методу с разным названием(Остальное не имеет значения);
//        2. Создайте Список(List);
//        3. Создайте метод, который будет принимать и возвращать Список, и проводить с ним следующие итерации:
//          а). Если список пустой, добавьте в него 6 объектов 1го Вашего класса;
//          б). После добавьте в начало списка 3 объекта 2го Вашего класса;
//          в). После замените последние 3 элемента списка на 3 объекта 3го Вашего класса;
//        4. Создайте второй метод, который на вход будет принимать Список и возвращать список и будет выполнять следующую логику:
//        Проверять количество экземпляров класса в принятом Списке и оставлять только по 2 экземпляра каждого из 3 Ваших
//        классов(то есть, 6 объектов в сумме).
//        5. Создать третий метод, который также будет принимать Список и будет в зависимости от экземпляра класса
//        вызывать Ваши методы. После вызова всех методов всех классов очистите Список.
//        6. Повторите описанную логику Выше с набором(Set). В данном задании Вам понадобиться воспользоваться
//        Итератором(Iterator).

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        //List creation and call of list related methods
        System.out.println("-------List section-------");
        ArrayList list = new ArrayList();
        list = modify(list);
        list = reduction(list);
        selector(list);

        //Set creation and call of set related methods
        System.out.println("-------Set section-------");
        HashSet set = new HashSet();
        set = modify(set);
        set = reduction(set);
        selector(set);
    }

    /**
     * ---------------------List related methods---------------------
     */
    public static ArrayList modify(ArrayList list) {
        if (list.isEmpty()) {
            //new elements
            list.add(new SalesRep("Alex", 8));
            list.add(new SalesRep("Bob", 7));
            list.add(new SalesRep("Adam", 120));
            list.add(new SalesRep("Tom", 33));
            list.add(new SalesRep("Mike", 23));
            list.add(new SalesRep("Max", 73));
            //three elements at the beginning
            list.add(0, new Supervisor("Peter", 5));
            list.add(0, new Supervisor("Tomas", 39));
            list.add(0, new Supervisor("Bobby", 48));
            //overwrite last three elements
            list.set(6, new AreaManager("Sally", 85));
            list.set(7, new AreaManager("Joe", 19));
            list.set(8, new AreaManager("Josef", 245));
        }
        return list;
    }

    public static ArrayList reduction(ArrayList list) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = list.size() - 1; i >= 0; i--) {
            Object employee = list.get(i);
            if (employee instanceof SalesRep) {
                count1++;
                if (count1 > 2) list.remove(i);
            } else if (employee instanceof Supervisor) {
                count2++;
                if (count2 > 2) list.remove(i);
            } else if (employee instanceof AreaManager) {
                count3++;
                if (count3 > 2) list.remove(i);
            }
        }
        return list;
    }

    public static void selector(ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            Object employee = list.get(i);
            if (employee instanceof SalesRep) {
                ((SalesRep) employee).visitsNumber();
            } else if (employee instanceof Supervisor) {
                ((Supervisor) employee).subordinateNumber();
            } else if (employee instanceof AreaManager) {
                ((AreaManager) employee).salesPlanAdjustment();
            }
        }
        list.clear();
    }

    /**
     * ---------------------Set related methods---------------------
     */
    public static HashSet modify(HashSet set) {
        //as we don't have index in set, to fulfill 3.б and 3.в tasks conditions - set converted to list
        ArrayList list = new ArrayList();
        list.addAll(set);
        if (list.isEmpty()) {
            //new elements
            list.add(new SalesRep("Alex", 8));
            list.add(new SalesRep("Bob", 7));
            list.add(new SalesRep("Adam", 120));
            list.add(new SalesRep("Tom", 33));
            list.add(new SalesRep("Mike", 23));
            list.add(new SalesRep("Max", 73));
            //three elements at the beginning
            list.add(0, new Supervisor("Peter", 5));
            list.add(0, new Supervisor("Tomas", 39));
            list.add(0, new Supervisor("Bobby", 48));
            //overwrite last three elements
            list.set(6, new AreaManager("Sally", 85));
            list.set(7, new AreaManager("Joe", 19));
            list.set(8, new AreaManager("Josef", 245));
        }
        for (Object o : list) {
            set.add(o);
        }
        return set;
    }

    public static HashSet reduction(HashSet set) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object employee = iterator.next();
            if (employee instanceof SalesRep) {
                count1++;
                if (count1 > 2) iterator.remove();
            } else if (employee instanceof Supervisor) {
                count2++;
                if (count2 > 2) iterator.remove();
            } else if (employee instanceof AreaManager) {
                count3++;
                if (count3 > 2) iterator.remove();
            }
        }
        return set;
    }

    public static void selector(HashSet set) {
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object employee = iterator.next();
            if (employee instanceof SalesRep) {
                ((SalesRep) employee).visitsNumber();
            } else if (employee instanceof Supervisor) {
                ((Supervisor) employee).subordinateNumber();
            } else if (employee instanceof AreaManager) {
                ((AreaManager) employee).salesPlanAdjustment();
            }
        }
        set.clear();
    }
}
