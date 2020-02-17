package HomeWork10;

abstract public class Plants implements AdvancedClassification {
    private int height;
    private int width;
    private int age;
    private String name;

    public Plants() {
    }

    public Plants(int height, int width, int age, String name) {
        this.height = height;
        this.width = width;
        this.age = age;
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void mainMessage();
}