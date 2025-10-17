public class ServiceItem extends Item {
    private Double price;
    public ServiceItem(String description, Double price) {
        super(description);
        this.price = price;
    }
    @Override
    public Double getPrice() {
        return price;
    }
    public void print() {
        System.out.println("Description: " + description + "\nPrice: " + price);
    }
}
