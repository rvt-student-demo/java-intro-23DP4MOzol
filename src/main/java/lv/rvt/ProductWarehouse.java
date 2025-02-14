package lv.rvt;

public class ProductWarehouse extends Warehouse {
    private String productName;

    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }

    public String getName() {
        return productName;
    }

    public void setName(String newName) {
        this.productName = newName;
    }

    @Override
    public String toString() {
        return productName + ": " + super.toString();
    }
}
