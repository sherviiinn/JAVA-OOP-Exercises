import java.util.Random;
import java.util.Scanner;
public class Game {
    private final String[] words = {"java", "python", "programming", "developer", "object"};
    private final Word word = new Word();
    private final StringBuilder answer = new StringBuilder();
    Scanner sc = new Scanner(System.in);
    public void menu(){
        System.out.println("=== Welcome to Word Guess Game ===");
        System.out.println("""
                1.Choose a Random Word
                2.Enter a Word
                """);
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1 -> randomchoose();
            case 2 -> manualchoose();
        }
        start();
    }
    public void randomchoose(){
        Random rand = new Random();
        word.setWord(words[rand.nextInt(words.length)]);
    }
    public void manualchoose(){
        System.out.println("Enter a word: ");
        word.setWord(sc.nextLine());
    }
    public void start(){
        initstring();
        int wrongguess = 0;
        System.out.println("---------------------------------------------------");
        while(wrongguess != 5 && !word.getWord().contentEquals(answer) ){
            printman(wrongguess);
            System.out.println("Enter a word: ");
            char guess = sc.nextLine().charAt(0);//ارور براش بزارم تا درست وارد کنه کاربر
            if(!check(guess)) {
                System.out.println("Wrong guess");
                wrongguess++;
            }else{
                System.out.println("Correct");
            }
        }
        if(word.getWord().contentEquals(answer)){
            printman(wrongguess);
            System.out.println("Congratulations! You won!");
        }else{
            printman(wrongguess);
            System.out.println("Sorry, you lost!");
        }
    }
    public void printman(int x){
        switch (x) {
            case 0 : {
                System.out.print("""
                         __
                        |  |
                        |  O    Word = """ );
                System.out.print(answer);
                System.out.println("""
                        
                        |
                        |
                        """);
            }
            break;
            case 1 : {
                System.out.print("""
                         __
                        |  |
                        |  O    Word = """ );
                System.out.print(answer);
                System.out.println("""
                         
                       | / \s
                       |
                       \s""");
            }
            break;
            case 2 : {
                System.out.print("""
                         __
                        |  |
                        |  O    Word = \s""" );
                System.out.print(answer);
                System.out.println("""
                        
                        | /|
                        |
                        """);
            }
            break;
            case 3 : {
                System.out.print("""
                         __
                        |  |
                        |  O    Word = \s""" );
                System.out.print(answer);
                System.out.println("""
                        
                        | /|\\
                        |
                        """);
            }
            break;
            case 4 : {
                System.out.print("""
                         __
                        |  |
                        |  O    Word = \s""" );
                System.out.print(answer);
                System.out.println("""
                        
                        | /|\\
                        | /
                        """);
            }
            break;
            case 5 : {
                System.out.print("""
                         __
                        |  |
                        |  O    Word = \s""" );
                System.out.print(answer);
                System.out.println("""
                        
                        | /|\\
                        | / \\
                        """);
            }
        }
    }
    public void initstring(){
        for (int i = 0; i < word.wordlength(); i++) {
            answer.append("-");
        }
    }
    public boolean check(char guess){
        boolean correct = false;
        for (int i = 0; i < word.wordlength(); i++) {
        if(word.getWord().charAt(i) == guess){
            correct = true;
            answer.setCharAt(i,guess);
        }
    }
    return correct;
    }
}
