package Guess_Number_375;

public class getMoneyAmount {
  public static int calculate(int low, int high) {
    if(low >= high) return 0;
      int minres = Integer.MAX_VALUE;
      for(int i = low; i <= high; i++) {
          int res = i + Math.max(calculate(i+1, high), calculate(low, i-1));
          minres = Math.min(res,minres);
      }
      return minres;
    }
    public static int guessMoneyAmount(int n) {
        return calculate(1, n);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(guessMoneyAmount(n));
      } 
}
