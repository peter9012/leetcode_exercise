package java_overriding;

public class super_keyword {

  static class Parent {
    void show()
    {
        System.out.println("Parent's show()");
    }
  }

  static class Child extends Parent {
    @Override
    void show()
    {
        super.show();
        System.out.println("Child's show()");
    }
  }

  public static void main(String[] args)
  {
      Parent obj = new Child();
      obj.show();
  }
}
