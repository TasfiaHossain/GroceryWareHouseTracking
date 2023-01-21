
public class MementoPatternTest {
   
	public static void main(String[] args) {
   
      Originator originator = new Originator();
      CareTaker careTaker = new CareTaker();
      
      int test1 = 6939;
      int test2 = 240;
      int test3 = 34;
      int test4 = 203;
      
      originator.setState(test1);
      originator.setState(test2);//sets object to be saved
      careTaker.add(originator.saveStateToMemento());//want to save the object 
      
      originator.setState(test3);
      careTaker.add(originator.saveStateToMemento());
      
      originator.setState(test4);
      System.out.println("Current State: " + originator.getState());		
      
      originator.getStateFromMemento(careTaker.get(0));
      System.out.println("First saved State: " + originator.getState());
      originator.getStateFromMemento(careTaker.get(1));
      System.out.println("Second saved State: " + originator.getState());
   }
}
