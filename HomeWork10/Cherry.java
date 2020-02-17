package HomeWork10;

final public class Cherry extends Trees {
    private String sort;
    private boolean fructify;

    public Cherry() {
    }

    public Cherry(int height, int width, int age, String name, String growthZone, int growthPeriod, int numberOfTrees, String sort, boolean fructify) {
        super(height, width, age, name, growthZone, growthPeriod, numberOfTrees);
        this.sort = sort;
        this.fructify = fructify;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public boolean isFructify() {
        return fructify;
    }

    public void setFructify(boolean fructify) {
        this.fructify = fructify;
    }

    @Override
    public void mainMessage() {
        System.out.println("All about cherries here");
    }

    @Override
    public void printBasics() {
        System.out.println("This is cherry!");
    }

    public void cherryMessage() {
        System.out.println("Tasty!");
    }
}