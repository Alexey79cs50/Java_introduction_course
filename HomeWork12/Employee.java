package HomeWork12;

abstract public class Employee {
    private String name;
    private int monthExperience;

    public Employee() {
    }

    public Employee(String name, int monthExperience) {
        this.name = name;
        this.monthExperience = monthExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonthExperience() {
        return monthExperience;
    }

    public void setMonthExperience(int monthExperience) {
        this.monthExperience = monthExperience;
    }
}
