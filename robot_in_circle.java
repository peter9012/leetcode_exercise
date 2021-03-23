import javax.lang.model.util.ElementScanner6;

public class robot_in_circle {
  public boolean isRobotBounded(String instructions) {
    int[][] directions = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
    int x = 0, y = 0;
    int index = 0;
    for (char i : instructions.toCharArray()) {
      if (i == 'L')
        index = ( index + 3 ) % 4;
      else if (i == 'R')
        index = ( index + 1 ) % 4;
      else {
        x += directions[index][0];
        y += directions[index][1]; 
      }

    }
    return (x == 0 && y == 0) || (index != 0); 
  }
}