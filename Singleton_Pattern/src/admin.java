public class admin {
    private static final admin instance = new admin();
    private admin(){}

    public static admin getInstance(){
        return instance;
    }
    public void showMessage(){
        system.out.println("Admin Referenced");
    }
}