import java.util.ArrayList;

public class Order {
    public ArrayList<Item> positions;
    public Order(ArrayList<Item> positions) {
        this.positions = positions;
    }
    public Double getTotalPrice() {
        Double price = 0.0;
        for(Item position: positions) {
            price += position.getPrice();
        }
        return price;
    }
    public void printItems() {;
        for(Item position: positions) {
            position.print();
        }
    }
}
