package HomeWork10;

final public class Birch extends Trees {
    private int leavesNumber;
    private boolean cutDown;

    public Birch() {
    }

    public Birch(int height, int width, int age, String name, String growthZone, int growthPeriod, int numberOfTrees, int leavesNumber, boolean cutDown) {
        super(height, width, age, name, growthZone, growthPeriod, numberOfTrees);
        this.leavesNumber = leavesNumber;
        this.cutDown = cutDown;
    }

    public int getLeavesNumber() {
        return leavesNumber;
    }

    public void setLeavesNumber(int leavesNumber) {
        this.leavesNumber = leavesNumber;
    }

    public boolean isCutDown() {
        return cutDown;
    }

    public void setCutDown(boolean cutDown) {
        this.cutDown = cutDown;
    }

    @Override
    public void mainMessage() {
        System.out.println("All about birches here");
    }

    @Override
    public void printBasics() {
        System.out.println("This is birch!");
    }

    public double size(double modificator) {
        return super.getHeight() * super.getWidth() * modificator;
    }
}