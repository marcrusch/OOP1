import java.util.ArrayList;

public class BundleItem extends Item{
    public Double discount;
    public ArrayList<Item> positions;
    public BundleItem(String description, Double discount, ArrayList<Item> positions) {
        super(description);
        this.discount = discount;
        this.positions = positions;
    }

    @Override
    public Double getPrice() {
        Double price = 0.0;
        for(Item position: positions) {
            price += position.getPrice();
        }
        return price - discount;
    }

    @Override
    public void print() {
        System.out.println("Description: " + description);
        System.out.println("Discount: " + discount);
        for(Item position: positions) {
            position.print();
        }
    }
}
