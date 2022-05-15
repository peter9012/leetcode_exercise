package Course_Schedule_207;

import java.util.*;

public class Solution {


  public static boolean canFinish(int numCourses, int[][] prerequisites) {

    // course -> list of next courses
    HashMap<Integer, List<Integer>> courseDict = new HashMap<>();

    // build the graph first
    for (int[] relation : prerequisites) {
      // relation[0] depends on relation[1]
      if (courseDict.containsKey(relation[1])) {
        courseDict.get(relation[1]).add(relation[0]);
      } else {
        List<Integer> nextCourses = new LinkedList<>();
        nextCourses.add(relation[0]);
        courseDict.put(relation[1], nextCourses);
      }
    }

    boolean[] checked = new boolean[numCourses];
    boolean[] path = new boolean[numCourses];

    for (int currCourse = 0; currCourse < numCourses; ++currCourse) {
      if (isCyclic(currCourse, courseDict, checked, path))
        return false;
    }

    return true;
  }
  
  /*
   * postorder DFS check that no cycle would be formed starting from currCourse
   */
  protected static boolean isCyclic(
          Integer currCourse, HashMap<Integer, List<Integer>> courseDict,
          boolean[] checked, boolean[] path) {

    // bottom cases
    if (checked[currCourse])
      // this node has been checked, no cycle would be formed with this node.
      return false;
    if (path[currCourse])
      // come across a previously visited node, i.e. detect the cycle
      return true;

    // no following courses, no loop.
    if (!courseDict.containsKey(currCourse))
      return false;

    // before backtracking, mark the node in the path
    path[currCourse] = true;

    boolean ret = false;
    // postorder DFS, to visit all its children first.
    for (Integer child : courseDict.get(currCourse)) {
      ret = isCyclic(child, courseDict, checked, path);
      if (ret)
        break;
    }

    // after the visits of children, we come back to process the node itself
    // remove the node from the path
    path[currCourse] = false;

    // Now that we've visited the nodes in the downstream,
    // we complete the check of this node.
    checked[currCourse] = true;
    return ret;
  }

  public static void main(String args[])
  {
    int numTasks = 4;

    int[][] prerequisites = { { 1, 0 }, { 2, 1 }, { 3, 2 } };

    if (canFinish(numTasks, prerequisites)) {
      System.out.println("Possible to finish all tasks");
    }
    else {
      System.out.println("Impossible to finish all tasks");
    }
  }
}
