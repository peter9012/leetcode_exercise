import java.util.HashMap;

class Main {
  public static void main(String[] args) {
    // decode_string_01 pa = new decode_string_01();
    // String str = "3[a]2[bc]";
    // System.out.println(pa.decodeString(str)); 

    // zigzag_conversion zigzag_cov = new zigzag_conversion();
    // String str = "PAYPALISHIRING";
    // System.out.println(zigzag_cov.zigzagConversion(str, 3));

    // string_decode_ways_recursive decode_ways = new string_decode_ways_recursive();
    // String str = "23212";
    // System.out.println(decode_ways.numDecodings(str));

    // string_decode_ways_iterative decode_ways = new string_decode_ways_iterative();
    // String str = "23212";
    // System.out.println(decode_ways.numDecodings_space(str));

    // text_justification justify = new text_justification();
    // String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
    // System.out.println(justify.fullJustidy(words,5));

    // implement_strstr implement_strstr  = new implement_strstr();
    // String haystack = "Helloalenall", needle= "all";
    // System.out.println(implement_strstr.strStr(haystack, needle));

    // String gfg = new String("Welcome to geeksforgeeks");
    // System.out.print("Found g first at position : ");
    // System.out.println(gfg.indexOf('W'));

    // Longest_common_prefix Longest_common_prefix  = new Longest_common_prefix();
    // String[] strs = {"flower","flo","floor"};
    // System.out.println(Longest_common_prefix.longestCommonPrefix(strs));
    // length_of_last_word length_of_last_word = new length_of_last_word();
    // String str = "Hello world";
    // System.out.println(length_of_last_word.lengthOfLastWord(str));

    // HashMap<String, Integer> map  = new HashMap<>(); 
    // map.put("a", 100); 
    // map.put("b", 200); 
    // map.put("c", 300); 
    // map.put("d", 400); 

    // // print map details 
    // System.out.println("HashMap: "
    //                + map.toString()); 


    // int k = map.getOrDefault("b", 500); 

    // print the value of k returned by 
    // getOrDefault(Object key, V defaultValue) method 
  // System.out.println("Returned Value: " + k);

  // climb_stairs climb_stairs  = new climb_stairs();
  // System.out.println(climb_stairs.climbStairs(5));
  // unique_path uniquePaths  = new unique_path();
  // System.out.println(uniquePaths.uniquePaths(3,3));

  // unique_path_2 uniquePaths  = new unique_path_2();
  //  int[][] obstacleGrid = {
  //   {0, 0, 0, 0},
  //   {0, 1, 0, 0},
  //   {0, 0, 1, 0},
  //   {0, 0, 0, 0}
  //  };
  // System.out.println(uniquePaths.uniquePathsWithObstacles(obstacleGrid));

  // perfect_square perfectSquare = new perfect_square();
  // System.out.println(perfectSquare.numSquares(12));

  remove_element removeElement = new remove_element();
  int[] array = {0,1,2,2,3,0,4,2};
  int val = 2;
  System.out.println(removeElement.removeElement(array, val));
  }
}