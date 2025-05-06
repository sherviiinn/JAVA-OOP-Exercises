import java.util.ArrayList;

public class Order {
private String orderStatus;
private ArrayList<Food> foods;

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public ArrayList<Food> getFoods() {
        return foods;
    }

    public void setFoods(ArrayList<Food> foods) {
        this.foods = foods;
    }
    public void total() {
        double total = 0;
        for (Food f : foods) {
            total += f.getPrice();
        }
        System.out.println(total);
    }

}