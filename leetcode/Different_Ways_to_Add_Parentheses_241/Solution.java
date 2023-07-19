package Different_Ways_to_Add_Parentheses_241;

import java.util.*;

public class Solution {
  List<Integer> diffWaysToCompute(String input) {
    List<Integer> res = new LinkedList<>();
    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      // 扫描算式 input 中的运算符
      if (c == '-' || c == '*' || c == '+') {
        /****** 分 ******/
        // 以运算符为中心，分割成两个字符串，分别递归计算
        List<Integer>
                left = diffWaysToCompute(input.substring(0, i));
        List<Integer>
                right = diffWaysToCompute(input.substring(i + 1));
        /****** 治 ******/
        // 通过子问题的结果，合成原问题的结果
        for (int a : left)
          for (int b : right)
            if (c == '+')
              res.add(a + b);
            else if (c == '-')
              res.add(a - b);
            else if (c == '*')
              res.add(a * b);
      }
    }
    // base case
    // 如果 res 为空，说明算式是一个数字，没有运算符
    if (res.isEmpty()) {
      res.add(Integer.parseInt(input));
    }
    return res;
  }
}
