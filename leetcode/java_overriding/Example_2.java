package java_overriding;

// overload static methods
public class Example_2 {

  public static void foo() {
    System.out.println("MaximumScore.foo() called ");
  }
  public static void foo(int a) { 
    System.out.println("MaximumScore.foo(int) called ");
  }
  public static void main(String args[])
  { 
    Example_2.foo();
    Example_2.foo(10);
  }



}
