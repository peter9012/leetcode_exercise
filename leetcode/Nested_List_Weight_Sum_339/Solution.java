package Nested_List_Weight_Sum_339;


import java.util.*;

class NestedInteger {
  private List<NestedInteger> list;
  private Integer integer;

  public NestedInteger(List<NestedInteger> list){
    this.list = list;
  }

  public void add(NestedInteger nestedInteger) {
    if(this.list != null){
      this.list.add(nestedInteger);
    } else {
      this.list = new ArrayList();
      this.list.add(nestedInteger);
    }
  }

  public void setInteger(int num) {
    this.integer = num;
  }

  public NestedInteger(Integer integer){
    this.integer = integer;
  }

  public NestedInteger() {
    this.list = new ArrayList();
  }

  public boolean isInteger() {
    return integer != null;
  }

  public Integer getInteger() {
    return integer;
  }

  public List<NestedInteger> getList() {
    return list;
  }

  public String printNi(NestedInteger thisNi, StringBuilder sb){
    if(thisNi.isInteger()) {
      sb.append(thisNi.integer);
      sb.append(",");
    }
    sb.append("[");
    for(NestedInteger ni : thisNi.list){
      if(ni.isInteger()) {
        sb.append(ni.integer);
        sb.append(",");
      }
      else {
        printNi(ni, sb);
      }
    }
    sb.append("]");
    return sb.toString();
  }
}

public class Solution {

  public int depthSum(List<NestedInteger> nestedList) {
    return dfs(nestedList, 1);
  }

  private int dfs(List<NestedInteger> list, int depth) {
    int total = 0;
    for (NestedInteger nested : list) {
      if (nested.isInteger()) {
        total += nested.getInteger() * depth;
      } else {
        total += dfs(nested.getList(), depth + 1);
      }
    }
    return total;
  }
}
