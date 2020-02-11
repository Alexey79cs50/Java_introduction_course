package HomeWork8.HomeItems;

public class Bed extends Furniture {
    private int places;

    public Bed() {
    }

    public Bed(int height, int width, int length, String material, int places) {
        super(height, width, length, material);
        this.places = places;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }
}
