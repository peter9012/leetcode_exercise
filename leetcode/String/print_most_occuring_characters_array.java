package String;

import java.util.*;

public class print_most_occuring_characters_array {
  static void findMostOccurringChar (Vector<String> str) {
    int[] hash = new int[26];
    
    for (int i = 0; i < str.size(); i++ ) {
      for (int j = 0; j < str.get(i).length(); j++) {
        hash[str.get(i).charAt(j)-'a']++;
      }
    }
    int max = 0;
    for (int i = 0; i < 26; i++) {
      max = hash[i] > hash[max] ? i:max;
    }

    System.out.print((char)(max + 'a') +"\n");
    System.out.print(hash[max] +"\n");
  // for (int i = 0; i < 26; i++) {
  //   System.out.print(hash[i] +"\n");
  //   if (hash[i] != max)
  //     second= hash[i] > hash[second] ? i:second;
  // }

  // if (second == Integer.MIN_VALUE)
  //   System.out.printf("There is no second " + "largest element\n");
  // else {
  //   System.out.print((char)(second + 'a') +"\n");
  //   System.out.print(hash[second] +"\n");
  // }
  
  }

  public static void main(String[] args){
 
    // Declaring Vector of String type
    Vector<String> str = new Vector<String>();
    str.add("animal");
    str.add("zebra");
    str.add("lionzzzzzz");
    str.add("giraffe");
 
    findMostOccurringChar(str);
  }
}