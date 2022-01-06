package Maximum_Product_of_Word_Lengths_318;

public class Solution {
  public static int bitNumber(char ch) {
    return (int)ch - (int)'a';
  }

  public static int maxProduct(String[] words) {
    int n = words.length;
    int[] masks = new int[n];
    int[] lens = new int[n];

    int bitmask = 0;
    for (int i = 0; i < n; ++i) {
      bitmask = 0;
      for (char ch : words[i].toCharArray()) {

        bitmask |= 1 << bitNumber(ch);
      }
      masks[i] = bitmask;
      lens[i] = words[i].length();
    }

    int maxVal = 0;
    for (int i = 0; i < n; ++i)
      for (int j = i + 1; j < n; ++j)
        if ((masks[i] & masks[j]) == 0)
          maxVal = Math.max(maxVal, lens[i] * lens[j]);

    return maxVal;
  }
  public static void main(String args[]){
    String[] str = {"abcw","baz","foo","bar","xtfn","abcdef"};
    System.out.println("Maximum Product of Word Lengths is " + maxProduct(str));
  }
}
