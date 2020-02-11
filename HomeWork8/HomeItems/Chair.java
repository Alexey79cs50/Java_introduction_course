package HomeWork8.HomeItems;

public class Chair extends Furniture {
    private String type;

    public Chair() {
    }

    public Chair(int height, int width, int length, String material, String type) {
        super(height, width, length, material);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
