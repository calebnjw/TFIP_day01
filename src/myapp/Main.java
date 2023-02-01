// package name
package myapp;

// imports

// class declaration
public class Main {

  // entry point
  public static void main(String[] args) {
    System.out.println("Hello World! ");
    System.out.println("This is something else.");

    String[] nameList = new String[3];
    nameList[0] = "Apple";
    nameList[1] = "Pear";
    nameList[2] = "Orange";

    for (int i = 0; i < nameList.length; i += 1) {
      System.out.printf("%d: %s \n", (i + 1), nameList[i]);
    }
  }
}

