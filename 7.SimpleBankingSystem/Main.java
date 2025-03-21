public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Customer customer1 = new Customer("Kourosh", "123456");
        Customer customer2 = new Customer("Ali", "789101");
        
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
        
        customer1.depositMoney(500);
        customer1.withdrawMoney(200);
        customer1.checkBalance();
    }
}