package HomeWork10;

final public class Regulated extends HealthCare {
    private double importPrice;
    private String currency;

    public Regulated() {
    }

    public Regulated(String name, int skuCode, int casePerPallet, boolean onStock, String brand, double unitPrice, double importPrice, String currency) {
        super(name, skuCode, casePerPallet, onStock, brand, unitPrice);
        this.importPrice = importPrice;
        this.currency = currency;
    }

    public double getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(double importPrice) {
        this.importPrice = importPrice;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void printDetails() {
        System.out.println("Item number: " + super.getSkuCode() + ". Item name: " + super.getName());
    }

    @Override
    public void groupMessage() {
        System.out.println("Regulated of health care portfolio");
    }

    @Override
    public void currencyCodeCheck() {
        if (this.currency.length() != 3){
            System.out.println("Currency code wrong format");
        } else {
            System.out.println("Currency is ok");
        }
    }

    @Override
    public void limitCheck() {

        if (this.importPrice * 2 < super.getUnitPrice()) {
            System.out.println(String.format("Regulated SKU %d too expensive", super.getSkuCode()));
        }

    }
}
