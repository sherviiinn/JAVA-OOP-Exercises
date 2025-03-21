public class Main {
    public static void main(String[] args) {

        //** this is a simple main class to test the classes, you can make a complete online shopping system with this classes if you want **//

        Store store = new Store();
        Product laptop = new Product("Laptop", 999.99);
        Product phone = new Product("Smartphone", 499.99);
        
        store.addProduct(laptop);
        store.addProduct(phone);
        
        Customer customer = new Customer("Kourosh");
        customer.addToCart(laptop);
        customer.addToCart(phone);
        customer.placeOrder();
    }
}