import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("What is your order number?");
        Scanner scanner = new Scanner(System.in);
        String orderID = scanner.next();

        System.out.println("What is your store number?");
        Scanner scanner1 = new Scanner(System.in);
        String storeID = scanner1.next();

        System.out.println("Choose your shipment method." +
                "\nNote: Recommended distance for driving shouldn't be more than 600 miles. " +
                "\nTruck " +
                "\nPlane " +
                "\nBoat" );
        Scanner scanner2 = new Scanner(System.in);
        String transportationSelect = scanner2.next();

        order o = null;
        o = new order();

        if ("Truck".equalsIgnoreCase(transportationSelect)){
            o.setSelectedTrans(new Plane());
        }
        else if ("Plane".equalsIgnoreCase(transportationSelect)){
            o.setSelectedTrans(new Truck());
        }
        else if ("Boat".equalsIgnoreCase(transportationSelect)){
            o.setSelectedTrans(new Boat());
        }

        // Randomly generates an invoice number
        int min = 100000000;
        int max = 999999999;

        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println("Your invoice number is #" + random_int + ".");

        o.trans(transportationSelect, storeID, orderID);
    }
}