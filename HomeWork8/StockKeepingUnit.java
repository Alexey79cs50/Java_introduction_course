package HomeWork8;

public class StockKeepingUnit {
    private int skuCode;
    private short casePerPallet;
    private boolean onStock;
    private int unitPerCase;
    private String skuName;
    private long brandCode;
    private double grossWeight;
    private double netWeight;
    private float unitPrice;

    public StockKeepingUnit() {
    }

    public StockKeepingUnit(int skuCode) {
        this.skuCode = skuCode;
    }

    public StockKeepingUnit(int skuCode, short casePerPallet) {
        this.skuCode = skuCode;
        this.casePerPallet = casePerPallet;
    }

    public StockKeepingUnit(int skuCode, short casePerPallet, boolean onStock) {
        this.skuCode = skuCode;
        this.casePerPallet = casePerPallet;
        this.onStock = onStock;
    }

    public StockKeepingUnit(int skuCode, short casePerPallet, boolean onStock, int unitPerCase) {
        this.skuCode = skuCode;
        this.casePerPallet = casePerPallet;
        this.onStock = onStock;
        this.unitPerCase = unitPerCase;
    }

    public StockKeepingUnit(int skuCode, short casePerPallet, boolean onStock, int unitPerCase, String skuName) {
        this.skuCode = skuCode;
        this.casePerPallet = casePerPallet;
        this.onStock = onStock;
        this.unitPerCase = unitPerCase;
        this.skuName = skuName;
    }

    public StockKeepingUnit(int skuCode, short casePerPallet, boolean onStock, int unitPerCase, String skuName, long brandCode) {
        this.skuCode = skuCode;
        this.casePerPallet = casePerPallet;
        this.onStock = onStock;
        this.unitPerCase = unitPerCase;
        this.skuName = skuName;
        this.brandCode = brandCode;
    }

    public StockKeepingUnit(int skuCode, short casePerPallet, boolean onStock, int unitPerCase, String skuName, long brandCode, double grossWeight) {
        this.skuCode = skuCode;
        this.casePerPallet = casePerPallet;
        this.onStock = onStock;
        this.unitPerCase = unitPerCase;
        this.skuName = skuName;
        this.brandCode = brandCode;
        this.grossWeight = grossWeight;
    }

    public StockKeepingUnit(int skuCode, short casePerPallet, boolean onStock, int unitPerCase, String skuName, long brandCode, double grossWeight, double netWeight) {
        this.skuCode = skuCode;
        this.casePerPallet = casePerPallet;
        this.onStock = onStock;
        this.unitPerCase = unitPerCase;
        this.skuName = skuName;
        this.brandCode = brandCode;
        this.grossWeight = grossWeight;
        this.netWeight = netWeight;
    }

    public StockKeepingUnit(int skuCode, short casePerPallet, boolean onStock, int unitPerCase, String skuName, long brandCode, double grossWeight, double netWeight, float unitPrice) {
        this.skuCode = skuCode;
        this.casePerPallet = casePerPallet;
        this.onStock = onStock;
        this.unitPerCase = unitPerCase;
        this.skuName = skuName;
        this.brandCode = brandCode;
        this.grossWeight = grossWeight;
        this.netWeight = netWeight;
        this.unitPrice = unitPrice;
    }

    public int getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(int skuCode) {
        this.skuCode = skuCode;
    }

    public short getCasePerPallet() {
        return casePerPallet;
    }

    public void setCasePerPallet(short casePerPallet) {
        this.casePerPallet = casePerPallet;
    }

    public boolean isOnStock() {
        return onStock;
    }

    public void setOnStock(boolean onStock) {
        this.onStock = onStock;
    }

    public int getUnitPerCase() {
        return unitPerCase;
    }

    public void setUnitPerCase(int unitPerCase) {
        this.unitPerCase = unitPerCase;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public long getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(long brandCode) {
        this.brandCode = brandCode;
    }

    public double getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(double grossWeight) {
        this.grossWeight = grossWeight;
    }

    public double getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(double netWeight) {
        this.netWeight = netWeight;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "StockKeepingUnit{" +
                "itemId=" + skuCode +
                ", casePerPallet=" + casePerPallet +
                ", layersPerPallet=" + onStock +
                ", unitPerCase=" + unitPerCase +
                ", skuName='" + skuName + '\'' +
                ", brand='" + brandCode + '\'' +
                ", grossWeight=" + grossWeight +
                ", netWeight=" + netWeight +
                ", unitPrice=" + unitPrice +
                '}';
    }
}