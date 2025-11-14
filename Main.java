import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Person p1 = new Person("Jilly", "Nguyen", 3, 123456789);

    System.out.println(p1);
    p1.updateName("Amy");
    System.out.println(p1.getFirst());

  }
}

