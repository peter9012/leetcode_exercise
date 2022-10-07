package Amazon_OA;

import java.util.*;


public class items_in_container {
  public static List<Integer> numberOfItems(String s, List<Integer> startIndices, List<Integer> endIndices) {
    int[] mem = new int[s.length()];
    int count = 0;
    for (int i = 0; i < s.length(); ++i) {
        if (s.charAt(i) == '|') {
            mem[i] = count;
        } else {
            ++count;
        }
    }
    List<Integer> ans = new ArrayList<>();
    for (int i = 0; i < startIndices.size(); ++i) {
        int start = startIndices.get(i) - 1;
        int end = endIndices.get(i) - 1;
        
        while (s.charAt(start) != '|') ++start;
        while (s.charAt(end) != '|') --end;

        ans.add(mem[end] - mem[start]);
    }
    return ans;
  }

  // public static List<Integer> numberOfItems(String s, List<List<Integer>> ranges) {
  //   int n = s.length();
  //   Map<Integer, Integer> map = new HashMap();
  //   int sum = 0;
  //   int cumSum = 0;
  //   boolean started = false;
  //   for(int i = 0; i < n; i++){
  //       if(s.charAt(i) == '|'){
  //           if(started){
  //               cumSum += sum;
  //               map.put(i,cumSum);
  //           }
  //           else
  //               map.put(i,0);
  //           started = true;
  //           sum = 0;
  //       }else{
  //           sum++;
  //       }
  //   }
  //   int right = -1;
  //   int[] rightBoundary = new int[n];
  //   for(int i = n-1; i >=0; i--){
  //       if(s.charAt(i) == '|'){
  //           right = i;
  //       }
  //       rightBoundary[i] = right;    
  //   }
  //   int left = -1;
  //   int[] leftBoundary = new int[n];
  //   for(int i = 0; i < n; i++){
  //       if(s.charAt(i) == '|'){
  //           left = i;
  //       }
  //       leftBoundary[i] = left;    
  //   }
  //   List<Integer> res = new ArrayList();
  //   for(List<Integer> items: ranges){
  //       int start = rightBoundary[items.get(0)];
  //       int end = leftBoundary[items.get(1)];
  //       if(start != -1 && right != -1 && start < end){
  //           res.add(map.get(end) - map.get(start));
  //       }else
  //           res.add(0);
            
  //   }
  //   return res;
  // }
}
