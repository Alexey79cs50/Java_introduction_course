package HomeWork12;

public class Supervisor extends Employee {
    public Supervisor() {
    }

    public Supervisor(String name, int monthExperience) {
        super(name, monthExperience);
    }

    public void subordinateNumber(){
        int subordinates;
        if (super.getMonthExperience() > 24){
            subordinates = 6;
        } else {
            subordinates = (super.getMonthExperience() / 12) + 4;
        }
        System.out.println("Sales supervisor " + super.getName() + " subordinates: " + subordinates);
    }
}
