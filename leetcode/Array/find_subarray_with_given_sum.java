package Array;

public class find_subarray_with_given_sum {
  int subArraySum(int arr[], int n, int sum) {
    int curr_sum, i, j;
    for (i = 0; i < n; i++) {
      curr_sum = arr[i];

      // try all subarrays starting with 'i'
      for (j = i + 1; j <= n; j++) {
        if (curr_sum == sum) {
          int p = j - 1;
          System.out.println("Sum found between indexes " + i + " and " + p);
          return 1;
        }
        if (curr_sum > sum || j == n)
          break;
        curr_sum = curr_sum + arr[j];
      }
    }

    System.out.println("No subarray found");
    return 0;
  }

  public static void main(String[] args) {
    find_subarray_with_given_sum arraysum = new find_subarray_with_given_sum();
    // int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
    int arr[] = { 1, 2, 3, 7, 5 };
    int n = arr.length;
    int sum = 12;
    arraysum.subArraySum(arr, n, sum);
  }

}