package HomeWork10;

abstract public class StockKeepingUnit implements ExtendedCheck, SpecialCheck{
    private String name;
    private int skuCode;
    private int casePerPallet;
    private boolean onStock;

    public StockKeepingUnit() {
    }

    public StockKeepingUnit(String name, int skuCode, int casePerPallet, boolean onStock) {
        this.name = name;
        this.skuCode = skuCode;
        this.casePerPallet = casePerPallet;
        this.onStock = onStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(int skuCode) {
        this.skuCode = skuCode;
    }

    public int getCasePerPallet() {
        return casePerPallet;
    }

    public void setCasePerPallet(int casePerPallet) {
        this.casePerPallet = casePerPallet;
    }

    public boolean isOnStock() {
        return onStock;
    }

    public void setOnStock(boolean onStock) {
        this.onStock = onStock;
    }

    public void mainMessage() {
        System.out.println("Inventory module");
    }
}
