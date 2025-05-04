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
            3.Two Player Mode""");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1 -> {
                randomchoose();
                start("Player");
            }
            case 2 -> {
                manualchoose();
                start("Player");
            }
            case 3 -> twoplayer();
        }
    }

    public void randomchoose(){
        Random rand = new Random();
        word.setWord(words[rand.nextInt(words.length)]);
    }
    public void manualchoose(){
        System.out.println("Enter a word: ");
        word.setWord(sc.nextLine());
    }
    public void start(String playerName){
        answer.setLength(0); // پاک‌سازی پاسخ قبلی
        initstring();
        int wrongguess = 0;
        while(wrongguess != 5 && !word.getWord().contentEquals(answer) ){
            printman(wrongguess);
            System.out.println(playerName + ", enter a letter: ");
            char guess = sc.nextLine().toLowerCase().charAt(0);
            while(!validguess(guess)){
                System.out.print("Invalid guess\nTry again: ");
                guess = sc.nextLine().toLowerCase().charAt(0);
            }
            if (duplicate(guess)){
                System.out.println("You cannot have duplicate letter!");
                wrongguess++;
                continue;
            }
            if(!check(guess)) {
                System.out.println("Wrong guess");
                wrongguess++;
            }else{
                System.out.println("Correct");
            }
        }
        printman(wrongguess);
        if(word.getWord().contentEquals(answer)){
            System.out.println("Congratulations " + playerName + "! You won!");
        }else{
            System.out.println("Sorry " + playerName + ", you lost!");
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
                        |  O    Word =\s""" );
                System.out.print(answer);
                System.out.println("""
                        \s
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
        answer.append("-".repeat(Math.max(0, word.wordlength())));
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
    public boolean validguess(char guess){
        return guess >= 'a' && guess <= 'z' || guess >= 'A' && guess <= 'Z';
    }
    public boolean duplicate(char guess){
        boolean duplicate = false;
        for (int i = 0; i < answer.length(); i++) {
            if( answer.charAt(i) == guess)
                duplicate = true;
        }
        return duplicate;
    }
    public void twoplayer() {
        System.out.println("Player 1, enter a word: ");
        word.setWord(sc.nextLine().toLowerCase());
        for (int i = 0; i < 50; i++) System.out.println();//برای ندیدن کلمه
        start("Player 2");
    }
}