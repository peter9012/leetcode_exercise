package String;

public class Substring {
  public static void main(String args[])
  {
//    index of substring starts from 1
    String str = new String("Welcome to central park");
    System.out.print("The extracted substring is:");
    System.out.println(str.substring(0,7));
    System.out.print("The extracted substring is:");
    System.out.println(str.substring(11));
  }
}
