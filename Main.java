public class Main {
    public static void main(String[] args) {
        SliceoHeaven pizzaStore = new SliceoHeaven();

        pizzaStore.storeAddress = "123 Pizza Street";
        pizzaStore.storeMenu = "Pizza, Sides, Drinks";
        pizzaStore.storeName = "SliceoHeaven";
        pizzaStore.storePhone = 1234567890;
        pizzaStore.storeEmail = "info@sliceoheaven.com";

        pizzaStore.takeOrder("SOH-123", "Pepperoni, Mushrooms", 20.50);

        System.out.println("Order ID: " + pizzaStore.getOrderID());
        System.out.println("Pizza Ingredients: " + pizzaStore.getPizzaIngredients());
        System.out.println("Order Total: " + pizzaStore.getOrderTotal());
    }
}