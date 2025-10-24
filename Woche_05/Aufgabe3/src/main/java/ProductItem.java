public class ProductItem extends Item {
    private Integer amount;
    private Double pricePerUnit;
    public ProductItem(String description, Double pricePerUnit, Integer amount) {
        super(description);
        this.amount = amount;
        this.pricePerUnit = pricePerUnit;
    }
    @Override
    public Double getPrice() {
        return amount * pricePerUnit;
    }
    public void print() {
        System.out.println("Description: " + description + "\nPricePerUnit: " + pricePerUnit + "\nAmount: " + amount );
    }
}
