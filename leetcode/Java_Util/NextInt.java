package Java_Util;
import java.util.*;

public class NextInt {
  public static void main(String args[])
  {
    // create random object
    Random ran = new Random();
    // Print next int value
    // Returns number between 0-9
    int nxt = ran.nextInt(10);
    // Printing the random number
    // between 0 and 9
//    f1
    // f2
    System.out.println("Random number between 0 and 10 is : " + nxt);
  }
}
