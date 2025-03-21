public class Main {
    public static void main(String[] args) {

        //** this is a simple main class to test the classes, you can make a complete food ordering system with this classes if you want **//

        Restaurant restaurant = new Restaurant();
        MenuItem burger = new MenuItem("Burger", 5.99);
        MenuItem pizza = new MenuItem("Pizza", 8.99);

        Customer customer = new Customer("Kourosh");
        Order order = customer.placeOrder(burger, pizza);
        restaurant.receiveOrder(order);
        
        restaurant.updateOrderStatus(order, "In Progress");
    }
}