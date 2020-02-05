package HomeWork7;

public class Dog {
    String name;
    int age;
    double weight;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void setName (String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge (int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setWeight (Double weight){
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';

    }
}
