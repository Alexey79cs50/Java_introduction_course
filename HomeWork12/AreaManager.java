package HomeWork12;

public class AreaManager extends Employee {
    public AreaManager() {
    }

    public AreaManager(String name, int monthExperience) {
        super(name, monthExperience);
    }

    public void salesPlanAdjustment(){
        System.out.println("Area manager " + super.getName() + " plan multiplier: " +
                (1 + (double) super.getMonthExperience() / 500));
    }
}
