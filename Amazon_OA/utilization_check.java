package Amazon_OA;

public class utilization_check {
  public int finalInstances(int instances, int[] averageUtil) {

    for(int i = 0; i < averageUtil.length; i++) {
      if(averageUtil[i] < 25) {
        if(instances > 1) {
          instances = (instances + 1)/2;
          i += 10;
        }
      }
      else if(averageUtil[i] > 60) {
        if(instances * 2 <= 200000000) {
          instances *= 2;
          i += 10;
        }
      }
    }
    return instances;
  }
}
