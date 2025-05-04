public class Main {
    public static void main(String[] args) {
        String p ="yes";
        while (p.equalsIgnoreCase("yes")) {
        Game game = new Game();
        game.menu();
        System.out.println("Would you like to play again? (yes/no)");
        }
    }
}
