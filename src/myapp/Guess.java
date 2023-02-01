package myapp;

import java.io.Console;
import java.util.Random;

public class Guess {
  public static void main(String[] args) {
    Console cons = System.console();
    Random random = new Random();

    boolean win = false;
    int answer = random.nextInt(21); // 0 to 20, not inclusive of 21. 
    int guessInt;
    int chances = 5;

    System.out.println(answer);
    System.out.printf("Guess a number between 0 and 20. You have %d guesses. \n", chances);

    do {
      String guessStr = cons.readLine("What's your guess? ");
      guessInt = Integer.parseInt(guessStr);

      chances -= 1;

      if (guessInt < answer) {
        System.out.printf("Guess a higher number. You have %d %s remaining. \n", chances, (chances >= 2 || chances == 0 ? "tries" : "try"));

      } else if (guessInt > answer) {
        System.out.printf("Guess a lower number. You have %d %s remaining. \n", chances, (chances >= 2 || chances == 0 ? "tries" : "try"));
      
      } else {
        System.out.printf("You got it! \n");
        win = true;
      }
      

      if (chances == 0 && !win) {
        System.out.printf("You lost! You ran out of tries. The number was %d. \n", answer);
      }
    } while (!win && chances > 0);
  }
}