import java.util.Scanner;

public class input {

  public static void main(String args[]) {

    Scanner obj = new Scanner(System.in);
    int num1, num2;
    float n1, n2;

    System.out.println("Enter a Number =");
    num1 = obj.nextInt();
    n1 = obj.nextFloat();

    System.out.println("Enter a Number =");
    num2 = obj.nextInt();
    n2 = obj.nextFloat();

    System.out.println("Sum of two Numbers =" + (num1 + num2));
    System.out.println("Sum of two Numbers =" + (n1 + n2));

  }

}
