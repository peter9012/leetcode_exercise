package Java_Util;
import java.util.*;

public class ArrayList_Set {
  public static void main(String[] argv) throws Exception
  {
    try {
      // Creating object of ArrayList<Integer>
      ArrayList<Integer> arrlist = new ArrayList<Integer>();

      // Populating arrlist1
      arrlist.add(1);
      arrlist.add(2);
      arrlist.add(3);
      arrlist.add(4);
      arrlist.add(5);

      // print arrlist
      System.out.println("Before operation: " + arrlist);

      // Replacing element at the index 3 with 30
      // using method set()
      int i = arrlist.set(3, 30);

      // Print the modified arrlist
      System.out.println("After operation: " + arrlist);

      // Print the Replaced element
      System.out.println("Replaced element: " + i);
    }

    catch (IndexOutOfBoundsException e) {
      System.out.println("Exception thrown: " + e);
    }
  }
}

