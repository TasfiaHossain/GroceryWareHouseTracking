public class Main {
	 public static void main(String args[]){
	        ProductCollection newCollection = new ProductCollection(); 
	        WareHouseItems warehouse = new WareHouseItems(newCollection);//print Warehouse title
	        warehouse.printProducts();//print products in array 
	  }
}
