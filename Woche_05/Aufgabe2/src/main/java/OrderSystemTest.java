import java.util.ArrayList;

public class OrderSystemTest {
    public static void main(String[] args) {
        ServiceItem testService = new ServiceItem("Test Service", 150.50);
        ProductItem testProduct = new ProductItem("Test product", 90.50, 5);
        ProductItem testProduct2 = new ProductItem("Test product 2", 10.50, 3);
        ArrayList<Item> positions2 = new ArrayList<Item>();
        positions2.add(testProduct2);
        BundleItem testBundle = new BundleItem("Test bundle", 20.0, positions2);
        ArrayList<Item> positions = new ArrayList<Item>();
        positions.add(testService);
        positions.add(testProduct);
        positions.add(testBundle);
        BundleItem testBundle2 = new BundleItem("Test bundle 2", 20.0, positions);

        ArrayList<Item> orderList = new ArrayList<Item>();
        orderList.add(testBundle2);

        Order testOrder = new Order(orderList);
        System.out.println(testOrder.getTotalPrice());
        testOrder.printItems();
    }
}
