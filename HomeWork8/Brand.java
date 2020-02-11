package HomeWork8;

/**
 * Lines commented - will not work
 *
 * 'final' modifier means that property is constant and can only be set once or during initialisation.
 *
 *  Empty constructor will not work as it allows to create object with no values assigned - this is not
 * acceptable for the 'final' modifier.
 *
 *  Setters will not create automatically by Alt+Ins. Parameters with 'final' modifier can't be changed after the first
 *  assignment. If to create setters manually - program will not compile, because setters will allow to do illegal action.
 *
 */

public class Brand {
    final private long brandCode;
    final private String brandName;
    final private short categoryCode;
//
//    public Brand() {
//    }
//
    public Brand(long brandCode, String brandName, short categoryCode) {
        this.brandCode = brandCode;
        this.brandName = brandName;
        this.categoryCode = categoryCode;
    }
//
//    public long setBrandCode(long brandCode) {
//        this.brandCode = brandCode;
//    }
//
    public long getBrandCode() {
        return brandCode;
    }
//
//    public long setBrandName(long brandCode) {
//        this.brandCode = brandCode;
//    }
//
    public String getBrandName() {
        return brandName;
    }
//
//    public long setCategoryCode(long brandCode) {
//        this.brandCode = brandCode;
//    }
//
    public short getCategoryCode() {
        return categoryCode;
    }
}
