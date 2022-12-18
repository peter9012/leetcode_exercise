package Jump_Game_II_45;

public class Solution {
  public static int jump(int[] nums) {
    if (nums == null || nums.length == 0 || nums.length == 1) {
      return 0;
    }
    //记录跳跃的次数
    int count=0;
    //当前的覆盖最大区域
    int curDistance = 0;
    //最大的覆盖区域
    int maxDistance = 0;
    for (int i = 0; i < nums.length; i++) {
      //在可覆盖区域内更新最大的覆盖区域
      maxDistance = Math.max(maxDistance,i+nums[i]);
      //说明当前一步，再跳一步就到达了末尾
      if (maxDistance>=nums.length-1){
        count++;
        break;
      }
      //走到当前覆盖的最大区域时，更新下一步可达的最大区域
      if (i==curDistance){
        curDistance = maxDistance;
        count++;
      }
    }
    return count;
  }
  public static void main(String args[])
  {
    int[] nums = {2,3,1,1,4};
    System.out.println(jump(nums));
  }
}