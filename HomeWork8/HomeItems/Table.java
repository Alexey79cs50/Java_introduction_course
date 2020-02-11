package HomeWork8.HomeItems;

public class Table extends Furniture {
    private String form;
    private String room;

    public Table() {
    }

    public Table(String form, String room) {
        this.form = form;
        this.room = room;
    }

    public Table(int height, int width, int length, String material, String form, String room) {
        super(height, width, length, material);
        this.form = form;
        this.room = room;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
}
