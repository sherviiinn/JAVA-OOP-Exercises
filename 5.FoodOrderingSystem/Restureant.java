import java.util.ArrayList;
import java.util.Scanner;

public class Restureant {
private ArrayList<Customer> customers;
private Menu menu;

    public ArrayList<Customer> getCustomer() {
        return customers;
    }

    public void setCustomer(ArrayList<Customer> customer) {
        this.customers = customer;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
    public Customer addcustomer() {
        Scanner sc = new Scanner(System.in);
        Customer customer = new Customer();
        System.out.println("Enter Your Name: ");
        customer.setName(sc.nextLine());
        customers.add(customer);
        System.out.println("Successfully added");
        return customer;
    }

}
