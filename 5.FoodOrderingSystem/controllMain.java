import java.util.ArrayList;
import java.util.Scanner;

public class controllMain {
    Restureant restureant = new Restureant();

    public controllMain() {
        restureant.setMenu(new Menu());
        restureant.setCustomer(new ArrayList<>());
    }
    public void start() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                1.Admin
                2.Customer
                3.Exit""");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> admin();
            case 2 -> customer();
            case 3 -> System.out.println("Thanks for using Restureant");
            default -> System.out.println("Invalid choice");
        }
    }

    public void admin() throws InterruptedException {
        System.out.println("""
                1.Add Food""");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1) {
            restureant.getMenu().addfood();
        } else {
            System.out.println("Invalid choice");
        }
        start();
    }

    public void customer() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                1.Order Food
                2.Track Order""");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            Customer customer = restureant.addcustomer();
            Order order = new Order();
            order.setFoods(new ArrayList<>());
            order.setOrderStatus("pending");
            String choice2;
            do {
                restureant.getMenu().printMenu();
                System.out.print("Select food number: ");
                int foodIndex = sc.nextInt();
                sc.nextLine();
                Food selectedFood = restureant.getMenu().getFoods().get(foodIndex);
                order.getFoods().add(selectedFood);
                System.out.println(selectedFood.getName() + " ordered.");
                System.out.println("Do you want to order more? (Y/N)");
                choice2 = sc.nextLine();
            } while (choice2.equalsIgnoreCase("Y"));
            customer.setOrder(order);
            System.out.print("Total Price: ");
            order.total();
            Thread.sleep(5000);
            order.setOrderStatus("completed");
            System.out.println(order.getOrderStatus());
            System.out.println("Your food is ready");
        } else if (choice == 2) {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            Customer found = null;
            for (Customer c : restureant.getCustomer()) {
                if (c.getName().equalsIgnoreCase(name)) {
                    found = c;
                    break;
                }
            }
            if (found != null && found.getOrder() != null) {
                System.out.println("Order Status: " + found.getOrder().getOrderStatus());
            } else {
                System.out.println("No order found for this name.");
            }
        } else {
            System.out.println("Invalid choice");
        }
        start();
    }
}
