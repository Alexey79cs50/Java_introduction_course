package HomeWork8;

import HomeWork8.HomeItems.*;

public class Home {
    private Table table;
    private Chair chair;
    private Bed bed;
    private Nightstand nightstand;
    private Wardrobe wardrobe;

    public Home() {
    }

    public Home(Table table, Chair chair, Bed bed, Nightstand nightstand, Wardrobe wardrobe) {
        this.table = table;
        this.chair = chair;
        this.bed = bed;
        this.nightstand = nightstand;
        this.wardrobe = wardrobe;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Chair getChair() {
        return chair;
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    public Nightstand getNightstand() {
        return nightstand;
    }

    public void setNightstand(Nightstand nightstand) {
        this.nightstand = nightstand;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public void setWardrobe(Wardrobe wardrobe) {
        this.wardrobe = wardrobe;
    }
}
