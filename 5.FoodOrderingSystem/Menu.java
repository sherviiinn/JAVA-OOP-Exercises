import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    static int i = 1;
    private HashMap<Integer,Food> foods = new HashMap<>();
    public void printMenu() {
        int i = 1;
        for (Map.Entry<Integer, Food> entry : foods.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue().getName() + " - " + entry.getValue().getPrice());
            i++;
        }
    }

    public void addfood() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Food Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Food Price: ");
        double price = sc.nextDouble();
        Food food = new Food(name, price);
        foods.put(i,food);
    }
    public HashMap<Integer, Food> getFoods() {
        return foods;
    }

    public void setFoods(HashMap<Integer, Food> foods) {
        this.foods = foods;
    }
}
