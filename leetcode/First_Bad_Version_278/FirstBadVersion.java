package First_Bad_Version_278;

public class FirstBadVersion {
  private boolean isBadversion(int i) {
		// TODO Auto-generated method stub
		return false;
	}

  // Time complexity :O(n)
  // Space complexity : O(1)
  public int firstBadVersion(int n){
    for(int i =1;i < n;i++) {
      if (isBadversion(i)) {
        return i;
      }
    }
    return n;
  }

	// Time complexity :O(logn)
  // Space complexity : O(1)
  public int firstBadVersionBinarySearch(int n) {
    int left = 1;
    int right = n;
    while (left < right) {
      int mid = left + (right - left)/2;
      if(isBadversion(mid)) {
        right = mid;
      }
      else 
      {
        left = mid + 1;
      }
    }
    return left;
  }
}
