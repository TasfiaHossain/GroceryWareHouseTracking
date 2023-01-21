import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Scanner;

public class FactoryPattern {


    public static void main(String[] args){
        runProgram();
    }

    public static void runProgram(){
        List<Products> addToInventory = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while (true) {

            //asks information about the product
            System.out.println("Adding items to the Whole Foods Warehouse. Type out what type of product is it you're adding: \n\n"
                    + "MEAT \n"
                    + "VEGETABLE \n"
                    + "DAIRY\n"
            );

            String type = input.nextLine().toUpperCase();

            if (!Products.TypeOfProducts.contains(type)){
                System.out.println("Type of product does not exist. Terminating program...");
                System.exit(0);
            }

            System.out.println("\nType the product name: ");

            String name = input.nextLine();

            System.out.println("\nType out the product description: ");

            String desc = input.nextLine();

            //product created
            Products newProduct = ProductFactory.getProduct(type, desc, name);

            newProduct.notifyCreation();

            //attempt to add a MeatType to MeatProduct
            if(type.equals("MEAT")){
                System.out.println("\nType out the type of meat created. Type of meat to set to:");
                for(MeatTypes m : EnumSet.allOf(MeatTypes.class)){
                    System.out.println(m);
                }

                String typedMeatType = input.nextLine().toUpperCase();

                for(MeatTypes m : EnumSet.allOf(MeatTypes.class)){

                    if(m.toString().equals(typedMeatType)){
                        MeatProduct.setMeatType((MeatProduct) newProduct, m);
                        System.out.println("\nMeatType set");
                        break;
                    }
                }
            }

            System.out.println("\nDo you have the brand for the product also? Type in 'Y' or 'N': ");

            String decision = "";

            while (!decision.equals("Y") && !decision.equals("N")) {
                decision = input.nextLine().toUpperCase();
                switch (decision) {
                    case "Y" -> {
                        System.out.println("Type in the brand name: ");
                        newProduct.setBrand(input.nextLine());
                    }
                    case "N" -> System.out.println("\nOk, product will be created without a brand");
                    default -> System.out.println("\nInput was not 'Y' or 'N'. Type again: ");
                }
            }

            //add product to Inventory
            addToInventory.add(newProduct);
            System.out.println("\n" + newProduct.getClass().getSimpleName() + " added");
            System.out.println("\nAdding more? Type in 'Y' or 'N': ");

            decision = "";

            while (!decision.equals("Y")) {
                decision = input.nextLine().toUpperCase();
                switch (decision) {
                    case "Y" -> {
                        System.out.println("\nReloading Program...");
                    }
                    case "N" -> {
                        System.out.println("\nTotal Products added to Inventory: " + addToInventory.size());
                        System.out.println("\nTerminating Program...");
                        System.exit(0);
                    }
                    default -> System.out.println("\nInput was not 'Y' or 'N'. Type again: ");
                }
            }
        }
    }


}
