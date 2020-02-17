package HomeWork10;

final public class Generics extends HealthCare {
    boolean prescription;
    int batchNumber;

    public Generics() {
    }

    public Generics(String name, int skuCode, int casePerPallet, boolean onStock, String brand, double unitPrice, boolean prescription, int batchNumber) {
        super(name, skuCode, casePerPallet, onStock, brand, unitPrice);
        this.prescription = prescription;
        this.batchNumber = batchNumber;
    }

    public boolean isPrescription() {
        return prescription;
    }

    public void setPrescription(boolean prescription) {
        this.prescription = prescription;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        this.batchNumber = batchNumber;
    }

    @Override
    public void groupMessage() {
        System.out.println("Inventory module. Generics group");
    }

    @Override
    public void mainMessage() {
        System.out.println("Generics of health care portfolio");
    }

    public void printDetails() {
        System.out.println("Item number: " + super.getSkuCode() + ". Item name: " + super.getName());
    }

}
