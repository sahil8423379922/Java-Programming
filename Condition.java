import java.util.*;

public class Condition {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int num;

    System.out.println("Enter a Number");
    num = sc.nextInt();

    // if (num > 20) {
    // System.out.println(num + " is the greater number");
    // } else {
    // System.out.println(num + " is not a greater number");
    // }

    if (num % 2 == 0) {
      System.out.println(num + " is a Even Number");
    } else {
      System.out.println(num + " is a Odd Number");
    }

  }

}
