package array;

import java.util.*;

public class UserdefinedArray {

  public static void main(String args[]) {

    int num[] = new int[5];
    Scanner sc = new Scanner(System.in);

    // num[0] = 24;
    // num[1] = 89;
    // num[2] = 75;
    // num[4] = 90;

    for (int x = 0; x < 5; x++) {
      System.out.println("Enter Element in array");
      num[x] = sc.nextInt();
    }

    for (int x = 0; x < 5; x++) {
      System.out.println("Value of aray  =" + num[x]);
    }

  }

}
