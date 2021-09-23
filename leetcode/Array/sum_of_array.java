package Array;

public class sum_of_array {
  public static int sumArray(int[] a) {
    int sum = 0;
    for(int i = 0; i < a.length; i++) {
      sum = sum + a[i];
    }
    return sum;
  }

  public static void main(String[] args) {
    int a[] = {1,2,3,4,5};
    int sum = sumArray(a);
    System.out.println(sum);
  }
}