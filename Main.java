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

    implement_strstr implement_strstr  = new implement_strstr();
    String haystack = "Helloalall", needle= "all";
    System.out.println(implement_strstr.strStr(haystack, needle));
  }
}