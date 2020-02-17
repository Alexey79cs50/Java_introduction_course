package HomeWork10;

abstract public class HealthCare extends StockKeepingUnit {
    private String brand;
    private double unitPrice;

    public HealthCare() {
    }

    public HealthCare(String name, int skuCode, int casePerPallet, boolean onStock, String brand, double unitPrice) {
        super(name, skuCode, casePerPallet, onStock);
        this.brand = brand;
        this.unitPrice = unitPrice;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    abstract public void groupMessage();

    @Override
    public void checkPrice() {
        if (this.unitPrice > 0) System.out.println("Price is positive!");
    }

    @Override
    public void checkOnStock() {
        System.out.println(String.format("We %s have it", super.isOnStock() ? "\b" : "don't"));
    }

    @Override
    public void checkLengthSku() {
        int skuCode = super.getSkuCode();
        if (skuCode > 99999) {
            System.out.println("SKU code too long");
        } else if (skuCode < 10000) {
            System.out.println("SKU code too short");
        } else {
            System.out.println("SKU code is ok");
        }
    }

    @Override
    public void checkCodeSku() {
        int skuCode = super.getSkuCode();
        if (skuCode % 10 == 3) {
            System.out.println("SKU code cant end by 3");
        }
    }

    @Override
    public void currencyCodeCheck() {

    }

    @Override
    public void limitCheck() {
        //not here :)
    }

}
