public class Main {
    public static void main(String[] args) {
        WarehouseManager manager1 = new WarehouseManager();
        WarehouseManager manager2 = new WarehouseManager();

        Order order = new Order();

        order.subscribe(manager1);
        order.subscribe(manager2);

        order.setDeliveryStatus("Accepted - Shipping Required");
        System.out.println(order.getDeliveryStatus());

        order.unsubscribe(manager2);

        order.setDeliveryStatus("Shipped - In Transit");
        System.out.println(order.getDeliveryStatus());
    }
}