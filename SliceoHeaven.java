public class SliceoHeaven {
    public String storeAddress;

    public  String storeMenu;

    public String storeName;
    public long storePhone;
    public String storeEmail;
    public String pizzaIngredients;
    public String pizzaPrice;
    public String sides;
    public String drinks;

    public static final String DEF_ORDER_ID = "DEF-SOH-099";
    public static final String DEF_PIZZA_INGREDIENTS = "Mozzarella Cheese";
    public static final double DEF_ORDER_TOTAL = 15.00;
    public SliceoHeaven() {
        this.pizzaIngredients = DEF_PIZZA_INGREDIENTS;
        this.orderTotal = DEF_ORDER_TOTAL;
        this.sides = ""; 
        this.drinks = ""; 
    }
    public SliceoHeaven(int orderID, String pizzaIngredients, double orderTotal) {
        this.orderID = orderID;
        this.pizzaIngredients = pizzaIngredients;
        this.orderTotal = orderTotal;
    }

    private String orderID;
    private double orderTotal;

    public void takeOrder(String id, String details, double total){
        orderID = id;
        orderTotal = total;

        System.out.println("Order accepted!");

        System.out.println("Order is being prepared");

        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            System.out.println("Order is ready for pickup!");
        }

        System.out.println("Your order is ready!");

        printReceipt();


    }
    
    private void printReceipt(){
        System.out.println("********RECEIPT********");

        System.out.println("Order ID: " + orderID);
        System.out.println("Order Total: " + orderTotal);
    }
    
}
public int getOrderID() {
    return orderID;
}
public void setOrderID(int orderID) {
    this.orderID = orderID;
}
public String getPizzaIngredients() {
    return pizzaIngredients;
}
public void setPizzaIngredients(String pizzaIngredients) {
    this.pizzaIngredients = pizzaIngredients;
}
public double getOrderTotal() {
    return orderTotal;
}
public void setOrderTotal(double orderTotal) {
    this.orderTotal = orderTotal;
}
private void printReceipt() {
}
