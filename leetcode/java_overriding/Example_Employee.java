package java_overriding;

public class Example_Employee {

  static class Employee {
    public static int base = 10000;
    int salary() {
      return base;
    }
  }

  static class Manager extends Employee {
    // This method overrides salary() of Parent
    int salary()
    {
        return base + 20000;
    }
  }

  static class Clerk extends Employee {
    // This method overrides salary() of Parent
    int salary()
    {
        return base + 10000;
    }
  }


  static void printSalary(Employee e)
  {
      System.out.println(e.salary());
  }

  public static void main(String[] args)
  {
      Employee obj1 = new Manager();

      // We could also get type of employee using
      // one more overridden method.loke getType()
      System.out.print("Manager's salary : ");
      printSalary(obj1);

      Employee obj2 = new Clerk();
      System.out.print("Clerk's salary : ");
      printSalary(obj2);
  }
}
