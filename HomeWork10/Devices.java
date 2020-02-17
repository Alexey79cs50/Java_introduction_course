package HomeWork10;

final public class Devices extends HealthCare {
    private String type;
    private boolean pharmaWarehouse;

    public Devices() {
    }

    public Devices(String name, int skuCode, int casePerPallet, boolean onStock, String brand, double unitPrice, String type, boolean pharmaWarehouse) {
        super(name, skuCode, casePerPallet, onStock, brand, unitPrice);
        this.type = type;
        this.pharmaWarehouse = pharmaWarehouse;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isPharmaWarehouse() {
        return pharmaWarehouse;
    }

    public void setPharmaWarehouse(boolean pharmaWarehouse) {
        this.pharmaWarehouse = pharmaWarehouse;
    }

    @Override
    public void groupMessage() {
        System.out.println("Devices of health care portfolio");
    }

    public void printDetails() {
        System.out.println("Item number: " + super.getSkuCode() + ". Item name: " + super.getName());
    }

}
