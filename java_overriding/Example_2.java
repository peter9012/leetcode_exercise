package java_overriding;

// overload static methods
public class Example_2 {

  public static void foo() {
    System.out.println("Test.foo() called ");
  }
  public static void foo(int a) { 
    System.out.println("Test.foo(int) called ");
  }
  public static void main(String args[])
  { 
    Example_2.foo();
    Example_2.foo(10);
  }



}
