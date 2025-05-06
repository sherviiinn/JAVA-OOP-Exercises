import java.util.Scanner;

public class Admin {
    public Court addcourt() {
        System.out.println("Enter court name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Court court = new Court(name);
        return court;
    }
    public Player addplayer(){
        System.out.println("Enter court name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Player player = new Player(name);
        return player;
    }
}
