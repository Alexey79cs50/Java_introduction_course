package HomeWork7;

public class Cat {
    String name;
    int age;
    double weight;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name, int age, double weight) {
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
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
