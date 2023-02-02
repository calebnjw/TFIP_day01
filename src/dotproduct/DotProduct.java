package dotproduct;

import java.io.Console;

public class DotProduct {
  public static void main(String[] args) {
    Console cons = System.console();

    String[][] matrixA = new String[3][4]; 
    String[] matrixB = new String[4]; 
    String[] resultMatrix = new String[3];

    int rowsA = 0;
    int rowsB = 0;

    // prompt user to enter matrixA values by row (3 rows of 4 values each)
    // >> 5, 3, 9, 1   >> take input like this and split into the individual values
    // >> 3, 6, 3, 4
    // >> 5, 5, 2, 3

    // prompt user to enter matrixB values by row (4 rows of 1 value each)
    // >> 5, 3, 9, 1   >> take input like this and split into the individual values

    // while loop to keep prompting user for data until all rows are filled

    while (rowsA < 3) {
      String row = cons.readLine("Please enter %s row of data in the form \"a,b,c,d\" with values separated by commas. ", (rowsA > 0 ? "the next" : "the first"));
      
      matrixA[rowsA] = row.split(",", 4); 
      
      rowsA += 1;
      System.out.println("rowsA: " + rowsA);
    }

    while (rowsB < 1) {
      String row = cons.readLine("Please enter the column of data you want to multiply in the form \"a,b,c,d\" with values separated by commas. ");
      
      matrixB = row.split(",", 4); 
      
      rowsB += 1;
      System.out.println("rowsB: " + rowsB);
    }

    // perform dot product on matrix
    // [[A1, B1, C1, D1],        [[W]
    //  [A2, B2, C2, D2],    •    [X]
    //  [A3, B3, C3, D3]]         [Y]
    //                            [Z]]

    // [A1*W + B1*X + C1*Y + D1*Z,
    //  A2*W + B2*X + C2*Y + D2*Z,
    //  A3*W + B3*X + C3*Y + D3*Z]

    int i = 0;
    while (i < matrixA.length) {
      int j = 0;
      int multiplicationResult = 0;

      while (j < matrixA[i].length) {
        multiplicationResult += Integer.parseInt(matrixA[i][j]) * Integer.parseInt(matrixB[j]);
        j += 1;
      }
      
      
      resultMatrix[i] = Integer.toString(multiplicationResult);

      i += 1;
      
      System.out.printf("Result of multiplication on row %d is %d. \n", i, multiplicationResult);
    }

    i = 0;  
    System.out.printf("The final matrix is: ");
    while (i < resultMatrix.length) {
      System.out.println(resultMatrix[i]);
      i += 1;
    }

  }
}