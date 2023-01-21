public class orderBuilder {

    public order meats (){
        order item = new order();
        item.addItem(new Pork());
        item.addItem(new beef());
        item.addItem(new chicken());
        return item;
    }

    public order veg (){
        order item = new order();
        item.addItem(new greens());
        item.addItem(new fruits());
        return item;
    }
}