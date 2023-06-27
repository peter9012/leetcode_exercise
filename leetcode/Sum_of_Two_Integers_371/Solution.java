package Sum_of_Two_Integers_371;

public class Solution {
  public static int getSum(int a, int b) {

    if (a == 0) return b;
    if (b == 0) return a;

    while (b != 0) {
      int carry = a & b;
      a = a ^ b;
      b = carry << 1;
    }
    return a;
  }

  public static void main(String[] args)
  {
    int a = 19, b = 1;
    System.out.println(getSum(a,b));
  }
}
