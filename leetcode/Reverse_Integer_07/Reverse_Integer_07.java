package Reverse_Integer_07;

public class Reverse_Integer_07 {
  public static int reverse(int x) {
    long rev= 0;
    while( x != 0){
      rev= rev*10 + x % 10;
      x= x/10;
      if( rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
        return 0;
    }
    return (int) rev;
  }
  public static void main(String[] args) {
    int input = 123;
    System.out.println(reverse(input));
  }
}
