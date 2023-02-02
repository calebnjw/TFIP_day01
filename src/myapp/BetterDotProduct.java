package myapp;

import java.io.Console;

public class BetterDotProduct {
  public static void main(String[] args) {
    Console cons = System.console();

    // get user input for size of matrix [rows x cols]
    int rows = Integer.parseInt(cons.readLine("How many rows do you want to multiply? "));
    int cols = Integer.parseInt(cons.readLine("How many terms in each row do you need? "));
    
    // create arrays based on size given
    int[][] matrixA = new int[rows][cols];
    int[] matrixB = new int[cols];
    int[] result = new int[rows];

    for (int i = 0; i < rows; i += 1) {
      // getting inputs from user
      // and split them by " " into a String array
      String[] matrixAIn = cons.readLine("Please enter %s row in the form \"a b c d ...\" (values separated by spaces). ", (i > 0 ? "the next" : "the first")).split(" ");
      // convert String array into the int array
      for (int j = 0; j < cols; j += 1) {
        matrixA[i][j] = Integer.parseInt(matrixAIn[j]);
      }
    }
    
    // get second matrix from user
    // and split them by " " into a String array
    String[] matrixBIn = cons.readLine("Please enter the column you want to multiply in the form \"a b c d ...\" (values separated by spaces). ").split(" ");
    // convert String array into the int array
    for (int i = 0; i < cols; i += 1) {
      matrixB[i] = Integer.parseInt(matrixBIn[i]);
    }

    // do matrix multiplication
    for (int i = 0; i < rows; i += 1) {
      int multResult = 0;

      for (int j = 0; j < cols; j += 1) {
        multResult += matrixA[i][j] * matrixB[j];
      }
      
      result[i] = multResult;
      System.out.printf("Result of multiplication on row %d is %d. \n", (i+1), multResult);
    }

    System.out.printf("The final matrix is: ");
    for (int i = 0; i < rows; i += 1) {
      System.out.println(result[i]);
    }
  }
}