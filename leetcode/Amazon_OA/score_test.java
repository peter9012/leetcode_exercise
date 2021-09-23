package Amazon_OA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class score_test {
  public static void main(String[] args) {

    // String[] arr = {"test1a", "test2", "test1b", "test1c", "test3"};
    // String[] scores = {"Wrong Answer", "OK", "Runtime Error", "OK", "Time limit
    // exceeded"};

    // String[] arr = {"codility1", "codility3", "codility2", "codility4b",
    // "codility4a"};
    // String[] scores = {"Wrong answer", "Wrong answer", "OK", "Runtime error",
    // "OK"};

    String[] arr = { "codility1", "codility3", "codility2" };
    String[] scores = { "Wrong answer", "OK", "OK" };

    System.out.println(solution(arr, scores));
  }

  public static int solution(String[] T, String[] R) {

    if (T == null || R == null || T.length != R.length) {
      return 0;
    }

    Map<String, List<String>> groups = new HashMap<>();

    for (int i = 0; i < T.length; i++) {

      String caseName = T[i];

      String groupName = caseName;

      if (Character.isLowerCase(caseName.charAt(caseName.length() - 1))) {
        groupName = caseName.substring(0, caseName.length() - 1);
      }

      if (!groups.containsKey(groupName)) {
        groups.put(groupName, new ArrayList<>());
      }
      groups.get(groupName).add(R[i]);

    }

    int passedGroups = 0;

    for (String groupName : groups.keySet()) {

      List<String> results = groups.get(groupName);

      boolean passed = true;

      for (String result : results) {
        if (!"OK".equals(result)) {
          passed = false;
          break;
        }
      }

      if (passed) {
        passedGroups++;
      }

    }

    return passedGroups * 100 / groups.size();

  }

}