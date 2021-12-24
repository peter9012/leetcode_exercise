package Java_Util;

import java.util.*;

public class TreeMap_lower_higher_key {
  public static void main(String args[])
  {

    // create an empty TreeMap
    TreeMap<Integer, String> numMap = new TreeMap<Integer, String>();
    // Insert the values
    numMap.put(6, "Six");
    numMap.put(1, "One");
    numMap.put(5, "Five");
    numMap.put(3, "Three");
    numMap.put(8, "Eight");
    numMap.put(10, "Ten");
    // Print the Values of TreeMap
    System.out.println("TreeMap: " + numMap.toString());
    // Get the greatest key mapping of the Map
    // As here 9 is not available it returns 8
    // because 9 is strictly less than 11, present
    System.out.print("Lower Key Entry of Element 9 is: ");
    System.out.println(numMap.lowerKey(9));
    // Though, 3 is available in the Map
    // it returns 1 because this method returns
    // strictly less than key according to the specified key
    System.out.print("Lower Key Entry of Element 3 is: ");
    System.out.println(numMap.lowerKey(3));
    int value = numMap.higherKey(3);

    // printing the value
    System.out.println("The higherKey value "
            + " for 3: " + value);
  }
}
