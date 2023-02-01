package myapp;

import java.io.Console;

public class Hello {
  public static void main(String[] args) {
    Console console = System.console();

    String name = console.readLine("Hello, what's your name? ");
    
    String ageStr = console.readLine("How old are you?");
    int ageInt = Integer.parseInt(ageStr);

    switch (name.trim().toUpperCase()) {
      case "CALEB": 
        System.out.printf("Heyo! \n");  
        break;
      case "FRED": 
        System.out.printf("Where's Daphne? \n");  
        break;
      default: 
        System.out.printf("Hello %s \n", name);  
        break;
    }

    if (ageInt < 30) {
      System.out.printf("You are too young for this program!");
    } else {
      System.out.printf("You claim to be %s years old. \n", ageInt);
      System.out.printf("Letting you in... \n");
      int count = ageInt;
      while (count > 0) {
        System.out.printf("%d\n", count);
        count--;
      }
      System.out.printf("You're in... \n");
    }
  }
}