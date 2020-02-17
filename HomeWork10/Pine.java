package HomeWork10;

final public class Pine extends Trees {
    private int conesQuantity;
    private String subtypeName;

    public Pine() {
    }

    public Pine(int height, int width, int age, String name, String growthZone, int growthPeriod, int numberOfTrees, int conesQuantity, String subtypeName) {
        super(height, width, age, name, growthZone, growthPeriod, numberOfTrees);
        this.conesQuantity = conesQuantity;
        this.subtypeName = subtypeName;
    }

    public int getConesQuantity() {
        return conesQuantity;
    }

    public void setConesQuantity(int conesQuantity) {
        this.conesQuantity = conesQuantity;
    }

    public String getSubtypeName() {
        return subtypeName;
    }

    public void setSubtypeName(String subtypeName) {
        this.subtypeName = subtypeName;
    }

    @Override
    public void mainMessage() {
        System.out.println("All about pines here");
    }

    @Override
    public void printBasics() {
        System.out.println("This is pine!");
    }

    public int allCones() {
        return super.getNumberOfTrees() * conesQuantity;
    }
}