package Recursion_Dynamic_Programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleApp {
  static int theNumber;
// ---
  public static int triangle(int n) {
    if (n==1)
      return 1;
    else {
      return (n + triangle(n-1));
    }
  }
// ---
  public static String getString() throws IOException {
    InputStreamReader intext = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(intext);
    return br.readLine();
  }
//  ---
  public static int getInt() throws IOException
  {
    String s = getString();
    return Integer.parseInt(s);
  }
//  ---
  public static void main(String[] args) throws IOException
  {
    System.out.print("Enter a number: ");
    theNumber = getInt();
    int theAnswer = triangle(theNumber);
    System.out.println("Triangle="+theAnswer);
  }
}
