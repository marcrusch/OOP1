import java.util.ArrayList;

public class OrderSystemTest {
    public static void main(String[] args) {
        ServiceItem testService = new ServiceItem("Test Service", 150.50);
        ProductItem testProduct = new ProductItem("Test product", 90.50, 5);

        ArrayList<Item> positions = new ArrayList<Item>();
        positions.add(testService);
        positions.add(testProduct);

        Order testOrder = new Order(positions);
        System.out.println(testOrder.getTotalPrice());
        testOrder.printItems();
    }
}
