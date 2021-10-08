package Math;

public class WaterAndJugProblem_365 {
  public static boolean canMeasureWater(int x, int y, int z) {
    if  (x + y < z) return false;
    if  (x == z || y == z || x + y == z) return true;

    return  z%GCD(x, y)==0;
  }
  public static int GCD(int a, int b) {
    while(b!= 0) {
      int temp = b;
      b = a%b;
      a = temp;
    }
    return a;
  }
  public static void main(String[] args) {
    int jug1Capacity = 3;
    int jug2Capacity = 5;
    int targetCapacity = 4;
    boolean res = canMeasureWater(jug1Capacity,jug2Capacity,targetCapacity);
    System.out.println(res);
  }
}
