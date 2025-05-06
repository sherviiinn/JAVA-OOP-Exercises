import java.util.ArrayList;
import java.util.Scanner;

public class ControllMain {
    private final ArrayList<Player> players = new ArrayList<Player>();
    private final ArrayList<Court> courts = new ArrayList<Court>();
    public void start(){
        System.out.println("""
                1.Admin
                2.Player
                3.Exit""");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice){
            case 1->admin();
            case 2->player();
            case 3-> System.out.println("Thank you for using our program");
        }
    }
    public void admin(){
        Admin admin = new Admin();
        System.out.println("""
                1.Add Court
                2.Add Player
                3.Exit""");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice == 1){
            courts.add(admin.addcourt());
        }else if(choice == 2){
            players.add(admin.addplayer());
        }else if(choice == 3){
            start();
        }
        start();
    }
    public void player(){
        System.out.println("""
                1.Book Court
                2.Exit""");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        boolean found = false;
        if(choice == 1){
            System.out.println("Enter Your Name ");
            String keyName = sc.next();
            for(Player p : players){
                if(p.getName().equals(keyName)){
                    found = true;
                }
            }
            if(found){
                bookCourt();
            }else{
                System.out.println("No Such Player Found");
            }
            start();
        }
    }
    public void bookCourt(){
        int  i = 1;
        for(Court c : courts){
            System.out.println(i+"."+c.getName());
        }
        System.out.println("Which court would you like to book?");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(courts.get(choice-1).isAvailable()){
            courts.get(choice-1).BookCourt();
        }else{
            System.out.println("That court is not available");
        }
    }
}
