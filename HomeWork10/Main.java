package HomeWork10;

//        Имея представления об обычных классах, абстрактных классах и интерфейсах необходимо создать следующие реализации:
//        Создайте 2 цепочки классов(из примера в классе: “Animal <- Cat <- Persian” / “People <- Employee <- FireMan”),
//        только придумать свои классы. Условия:
//          а). Всего классов для каждой цепочки должно быть 5;
//          б). Один главный класс, второй - наследуется от главного, и еще 3 класса, которые наследуются от второго;
//          в). Главный класс и второй класс наследник должен быть “без возможности создавать экземпляр класса”(подумайте
//          какими именно должны быть классы?)
//          г). В каждом класса должно быть минимум по 2 характеристики и по 1 методу(дополнительному);
//          д). Для каждого класса реализуйте все необходимые методы для работы, зная пройденные принципы ООП;
//          е). Финальные 3 класса-наследника в каждой цепочке должны быть “не наследуемые”;
//        Создайте 5 интерфейсов со следующими условиями:
//          а). Должно быть 2 пары, один интерфейс наследуется от другого и 1 отдельный интерфейс;
//          б). У каждого из 5 интерфейсов определите 2 заданных метода;
//          в). Одна цепочка классов должна имплементировать одну связку интерфейсов, а вторая цепочка классов должна
//          имплементировать другую связку интерфейсов и оставшийся отдельный интерфейс;
//        В классе Main создайте экземпляры всех классов и интерфейсов, запишите значения характеристик там где возможно
//        и вызовите все реализованные дополнительные методы в них.

public class Main {
    public static void main(String[] args) {
        //SKU by setters
        Devices devices = new Devices();
        devices.setName("18x6 body color #6");
        devices.setSkuCode(12345);
        devices.setCasePerPallet(120);
        devices.setOnStock(true);
        devices.setBrand("Click!");
        devices.setUnitPrice(30.5);
        devices.setPharmaWarehouse(false);
        devices.setType("Plaster");
        //SKU via constructor
        Generics generics = new Generics("400mg #12", 33333, 240, false,
                "Super", 33.0, false, 55555);
        Regulated regulated = new Regulated("200mg strong #3", 456, 20, true,
                "Super Strong", 50, 20, "USD");

        //interfaces methods
        regulated.checkLengthSku();
        generics.checkCodeSku();
        regulated.currencyCodeCheck();
        regulated.limitCheck();
        devices.checkOnStock();
        devices.checkPrice();
        //classes methods
        devices.mainMessage();
        devices.groupMessage();
        regulated.groupMessage();
        regulated.printDetails();
        generics.printDetails();

        //plants through setters
        Birch birch = new Birch();
        birch.setHeight(5);
        birch.setWidth(3);
        birch.setAge(15);
        birch.setName("Regular");
        birch.setGrowthZone("Middle");
        birch.setGrowthPeriod(6);
        birch.setNumberOfTrees(300);
        birch.setLeavesNumber(15000);
        birch.setCutDown(true);
        //plants through constructor
        Cherry cherry = new Cherry(500, 2, 30, "Sweet", "Warm", 8,
                50, "Red", true);
        Pine pine = new Pine(15, 5, 50, "Tall", "Cold", 12,
                5000, 500, "Blue");

        //interfaces methods
        cherry.checkHeight();
        birch.checkWidth();
        pine.printBasics();
        pine.printAdvanced();
        //classes methods
        pine.mainMessage();
        pine.groupMessage();
        pine.allCones();
        System.out.println(birch.size(0.9));
        cherry.cherryMessage();
    }
}
