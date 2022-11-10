package Letter_Combinations_of_Phone_Number_17;

import java.util.*;

public class Solution {

  static List<String> list = new ArrayList<>();

  public static List<String> letterCombinations(String digits) {
    if (digits == null || digits.length() == 0) {
      return list;
    }
    //初始对应所有的数字，为了直接对应2-9，新增了两个无效的字符串""
    String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    //迭代处理
    backTracking(digits, numString, 0);
    return list;
  }

  static StringBuilder temp = new StringBuilder();

  public static void backTracking(String digits, String[] numString, int num) {
    //遍历全部一次记录一次得到的字符串
    if (num == digits.length()) {
      list.add(temp.toString());
      return;
    }
    //str 表示当前num对应的字符串
    String str = numString[digits.charAt(num) - '0'];
    for (int i = 0; i < str.length(); i++) {
      temp.append(str.charAt(i));
      //c
      backTracking(digits, numString, num + 1);
      //剔除末尾的继续尝试
      temp.deleteCharAt(temp.length() - 1);
    }
  }
  public static void main(String[] args)
  {
    String digits = "23";
    System.out.println(Arrays.toString(letterCombinations(digits).toArray()));
  }
}
