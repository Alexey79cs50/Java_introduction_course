package HomeWork8.HomeItems;

public class Nightstand extends Furniture {
    private int quantity;

    public Nightstand() {
    }

    public Nightstand(int height, int width, int length, String material, int quantity) {
        super(height, width, length, material);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
