package HomeWork8.HomeItems;

public class Wardrobe extends Furniture {
    private int shelves;
    private int sections;

    public Wardrobe() {
    }

    public Wardrobe(int height, int width, int length, String material, int shelves, int sections) {
        super(height, width, length, material);
        this.shelves = shelves;
        this.sections = sections;
    }

    public int getShelves() {
        return shelves;
    }

    public void setShelves(int shelves) {
        this.shelves = shelves;
    }

    public int getSections() {
        return sections;
    }

    public void setSections(int sections) {
        this.sections = sections;
    }
}
