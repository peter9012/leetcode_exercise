package Excel_Sheet_Column_Title_168;

public class Solution {
  public static String convertToTitle(int n) {
    StringBuilder sb = new StringBuilder();
    while(n > 0){
      n--;
      int curr = n%26;
      n /= 26;
      sb.append((char)(curr+'A'));
    }
    return sb.reverse().toString();
  }
  public static void main(String[] args) {
    System.out.println(convertToTitle(701));

  }
}
