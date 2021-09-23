package java_inheritance;

public class Calculation {
  
  static class calcuation {
    int z;

    public void addition(int x, int y) {
      z = x + y;
      System.out.println("The sum of the given number is"+z);
    }
  
    public void Subtraction(int x, int y) {
      z = x - y;
      System.out.println("The difference between the given numbers:"+z);
    }

  }


  public static class My_Calculation extends calcuation {
    public void multiplication(int x, int y) {
       z = x * y;
       System.out.println("The product of the given numbers:"+z);
    } 
  }
  
  public static void main(String args[]) {
    int a = 20, b = 10;
    My_Calculation demo = new My_Calculation();
    demo.addition(a, b);
    demo.Subtraction(a, b);
    demo.multiplication(a, b);
  }

}


