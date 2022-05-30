package Search_in_a_Sorted_Array_of_Unknown_Size_702;

//public class Solution {
//  public int search(ArrayReader reader, int target) {
//    if (reader.get(0) == target) return 0;
//
//    int left = 0, right = 1;
//    while (reader.get(right) < target) {
//      left = right;
//      right <<= 1;
//    }
//
//    int mid, num;
//    while (left <= right) {
//      mid = left + ((right - left) >> 1);
//      num = reader.get(mid);
//
//      if (num == target) return mid;
//      if (num > target) right = mid - 1;
//      else left = mid + 1;
//    }
//    return -1;
//  }
//}
