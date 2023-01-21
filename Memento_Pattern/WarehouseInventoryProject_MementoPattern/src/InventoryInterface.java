
import java.util.Scanner; // import the Scanner class 

public class InventoryInterface {
 
	public static void main(String[] args) {
		
	Originator originator = new Originator();
	CareTaker caretaker = new CareTaker();
    
	Scanner myEmployeeInput = new Scanner(System.in);
    Scanner mySaveRedo = new Scanner(System.in);
    Scanner myMeat = new Scanner(System.in);
    Scanner myProduce = new Scanner(System.in);
    Scanner myDairy = new Scanner(System.in);
    String eID;
    String x;
   
    int meat = 100;
    int produce = 400;
    int dairy = 60;
	 
    originator.setState(meat);
    caretaker.add(originator.saveStateToMemento());
	 
    originator.setState(produce);
    caretaker.add(originator.saveStateToMemento());
	 
    originator.setState(dairy);
    caretaker.add(originator.saveStateToMemento());
     
    Scanner myShipment = new Scanner(System.in);
    String ship;
    
    String tasfiaID = "101";
    String dianaID = "201";
    
    System.out.println("Welcome to the Inventory Management System!\n"); 
    
    System.out.println("Please enter your Employee ID:"); 
    eID = myEmployeeInput.nextLine();  
        
    
    if(eID.equals(tasfiaID)){
    	System.out.println("\n****Welcome Tasfia Hossain****\n"); 
    }//if
    
    else if(eID.equals(dianaID)) {
    	System.out.println("\n****Welcome Diana Smith****\n"); 
	}
	
	else {
    	System.out.println("*User Not Found in the System*"); 
    	System.exit(0);
	}
    
    while(true) {
    System.out.println("Please type out what you will be recording from the following options:"
    					+"\nIncoming Shipment \n"
    					+"Outgoing Shipment \n"
    				  ); 
    
    ship = myShipment.nextLine();    
    
    if(ship.equals("Outgoing Shipment")) {
    	System.out.println("\nPlease record the number of Meat, Produce, and Dairy products that will be shipped out:"); 
    	int meat1 = myMeat.nextInt();
    	int produce1 = myProduce.nextInt();
    	int dairy1 = myDairy.nextInt();
    	
    	System.out.println("\n********Outgoing Inventory********"); 
    	System.out.println("\nNumber of Outgoing Meat Shipments: " + meat1 + " units"); 
    	System.out.println("Number of Outgoing Produce Shipments: " + produce1 + " units"); 
    	System.out.println("Number of Outgoing Dairy Shipments: " + dairy1 + " units\n"); 
    	
    	meat = meat - meat1;
    	produce = produce - produce1;
    	dairy = dairy - dairy1;
    	
    	if(meat<0) {
    		System.out.println("NOT ENOUGH MEAT UNITS AVAILABLE");
    		System.out.println("Please restart the system.");
    		break;
    	}
    	else if(produce<0) {
    		System.out.println("NOT ENOUGH PRODUCE UNITS AVAILABLE");
    		System.out.println("Please restart the system.");
    		break;
    	}
    	else if(dairy<0) {
    		System.out.println("NOT ENOUGH DAIRY UNITS AVAILABLE");
    		System.out.println("Please restart the system.");
    		break;
    	}
    	
    	System.out.println("\nFinished Entering? Enter Save or Undo."); 
        x = mySaveRedo.nextLine();  
        if(x.equals("Save")) {
        	
        	System.out.println("File Saved\n");
     		System.out.println("******Updated Inventory Transcript******\n");

	       	 originator.setState(meat);
	         caretaker.add(originator.saveStateToMemento());
	         System.out.println("New Meat Inventory Value: " + originator.getState() + " units");//saving only meat
	       	 originator.setState(produce);
	         caretaker.add(originator.saveStateToMemento());
	         System.out.println("New Produce Inventory Value: " + originator.getState() + " units");//saving only produce
	       	 originator.setState(dairy);
	         caretaker.add(originator.saveStateToMemento());
	         System.out.println("Number of Outgoing Dairy Shipments: " + originator.getState() + " units");//saving only dairy
        	System.exit(0);
    	}
        
        else if(x.equals("Undo")) {
        	System.out.println("\n****Original Inventory Values****\n"); 
            originator.getStateFromMemento(caretaker.get(0));
            System.out.println("Meat: " + originator.getState() + " units remaining");
            originator.getStateFromMemento(caretaker.get(1));
            System.out.println("Produce: " + originator.getState() + "units remaining");
            originator.getStateFromMemento(caretaker.get(2));
            System.out.println("Dairy: " + originator.getState() + " units remaining");
            break;
        }
    }
    
    else if(ship.equals("Incoming Shipment")) {
    	System.out.println("\nPlease record the number of Meat, Produce, and Dairy products that will be stored in:");
    	int meat2 = myMeat.nextInt();
    	int produce2 = myProduce.nextInt();
    	int dairy2 = myDairy.nextInt();
    	System.out.println("Total number of Incoming Meat Shipments: " + meat2 + " units"); 
    	System.out.println("Number of Incoming Produce Shipments: " + produce2 + " units"); 
    	System.out.println("Number of Incoming Dairy Shipments: " + dairy2 + " units"); 
    	
		meat = meat + meat2;
		produce = produce + produce2;
		dairy = dairy + dairy2;
		
		System.out.println("\nFinished Entering? Enter Save or Undo."); 
        x = mySaveRedo.nextLine();  
        if(x.equals("Save")) {
        	System.out.println("\nFile Saved\n");
    		System.out.println("****Updated Inventory Transcript****\n");
        	System.out.println("Meat: " + meat + " units in total"); 
        	System.out.println("Produce: " + produce + " units in total"); 
        	System.out.println("Dairy: " + dairy + " units in total"); 
        	System.exit(0);
    	}
        
        else if(x.equals("Undo")) {
        	System.out.println("\n****Original Inventory Values****\n"); 
            originator.getStateFromMemento(caretaker.get(0));
            System.out.println("Meat: " + originator.getState() + " units remaining");
            originator.getStateFromMemento(caretaker.get(1));
            System.out.println("Produce: " + originator.getState() + " units remaining");
            originator.getStateFromMemento(caretaker.get(2));
            System.out.println("Dairy: " + originator.getState() + " units remaining");
            break;
        }
    }//incoming
    
    
    else {
    	System.out.println("Invalid Entry"); 
		System.out.println("Please restart the system.");
    	System.exit(0);
    }
    	
    }
  }//main
}//mainbig
