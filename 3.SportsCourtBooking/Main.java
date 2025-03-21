public class Main {
    public static void main(String[] args) {

        //** this is a simple main class to test the classes, you can make a complete sport court booking with this classes if you want ***/

        Admin admin = new Admin();
        Court basketballCourt = new Court("Basketball");
        Court tennisCourt = new Court("Tennis");
        
        admin.addCourt(basketballCourt);
        admin.addCourt(tennisCourt);
        
        Player player1 = new Player("Kourosh");
        Player player2 = new Player("Ali");
        
        player1.bookCourt(basketballCourt);
        player2.bookCourt(basketballCourt); // Should print "Court is already booked!"
    }
}