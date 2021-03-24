package Recursion_Dynamic_Programming;

public class fibonacciTopDown {

  static int fibonacci(int n) {
    return fibonacci(n, new int[n+1]);
  }

  static int fibonacci(int i, int[] memo) {
    if(i == 0 || i == 1) return i;
    if(memo[i] == 0) {
      memo[i] = fibonacci(i-1, memo) + fibonacci(i-2,memo);
    }
    return memo[i];
  }

  public static void main(String[] args) {
    int n = 6;
    System.out.println(fibonacci(n));
  } 
}
