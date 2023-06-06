package Power_of_Three_326;

public class Solution {
  public static boolean isPowerOfThree(int n) {
    if (n < 1) {
      return false;
    }

    while (n % 3 == 0) {
      n /= 3;
    }

    return n == 1;
  }
  public static void main(String[] args)
  {
    int n = 27;
    System.out.println(isPowerOfThree(n));
  }
}
