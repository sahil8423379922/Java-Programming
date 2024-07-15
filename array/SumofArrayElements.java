package array;

import java.util.*;

public class SumofArrayElements {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int sum = 0;

    int arr[] = new int[10];

    for (int x = 0; x < 10; x++) {
      System.out.println("Enter element at position " + x);
      arr[x] = sc.nextInt();

    }

    for (int y = 0; y < 10; y++) {

      sum = sum + arr[y];

    }

    System.out.println("Sum of all aray elements =  " + sum);

  }

}
