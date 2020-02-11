package HomeWork8.HomeItems;

public class Furniture {
    private int height;
    private int width;
    private int length;
    private String material;

    protected Furniture() {
    }

    protected Furniture(int height, int width, int length, String material) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.material = material;
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

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
