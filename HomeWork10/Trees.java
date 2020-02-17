package HomeWork10;

abstract public class Trees extends Plants {
    private String growthZone;
    private int growthPeriod;
    private int numberOfTrees;

    public Trees() {
    }

    public Trees(int height, int width, int age, String name, String growthZone, int growthPeriod, int numberOfTrees) {
        super(height, width, age, name);
        this.growthZone = growthZone;
        this.growthPeriod = growthPeriod;
        this.numberOfTrees = numberOfTrees;
    }

    public String getGrowthZone() {
        return growthZone;
    }

    public void setGrowthZone(String growthZone) {
        this.growthZone = growthZone;
    }

    public int getGrowthPeriod() {
        return growthPeriod;
    }

    public void setGrowthPeriod(int growthPeriod) {
        this.growthPeriod = growthPeriod;
    }

    public int getNumberOfTrees() {
        return numberOfTrees;
    }

    public void setNumberOfTrees(int numberOfTrees) {
        this.numberOfTrees = numberOfTrees;
    }

    public void groupMessage() {
        System.out.println("This belongs to trees");
    }

    @Override
    public void checkHeight() {
        if (super.getHeight() > 100) {
            System.out.println("Height too big");
        } else {
            System.out.println("Height is ok");
        }
    }

    @Override
    public void checkWidth() {
        if (super.getWidth() > 100) {
            System.out.println("Width too big");
        } else {
            System.out.println("Width is ok");
        }
    }

    @Override
    public void printAdvanced() {
        System.out.println("Height is: " + super.getHeight() + ". Width is: " + super.getWidth());
    }
}