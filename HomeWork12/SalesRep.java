package HomeWork12;

public class SalesRep extends Employee {
    public SalesRep() {
    }

    public SalesRep(String name, int monthExperience) {
        super(name, monthExperience);
    }

    public void visitsNumber(){
        int visits;
        if (super.getMonthExperience() > 18){
            visits = 9;
        } else {
            visits = (super.getMonthExperience() / 6) + 6;
        }
        System.out.println("Sales representative " + super.getName() + " visits: " + visits);
    }
}
