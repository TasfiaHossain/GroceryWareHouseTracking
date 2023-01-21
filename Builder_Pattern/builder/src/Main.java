public class Main {
    public static void main(String[] args) {

        orderBuilder orderBuilder = new orderBuilder();

        order veggies = orderBuilder.veg();
        System.out.println("Shipments 1");
        veggies.showItems();
        System.out.println("Total Price: " + veggies.getCost() + "\r\n");

        order meats = orderBuilder.meats();
        System.out.println("Shipments 1");
        meats.showItems();
        System.out.println("Total Price: " + meats.getCost()+ "\r\n");
    }
}