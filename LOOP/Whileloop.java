package LOOP;

public class Whileloop {

  public static void main(String args[]) {
    int a = 1;

    System.out.println("Execution of While loop");

    while (a <= 10) {

      System.out.println(a);

      a++;

    }

    System.out.println("Execution of For loop");

    for (int b = 1; b <= 0; b++) {

      System.out.println(b);

    }

    System.out.println("Execution of do while loop");

    int c = 1;

    do {
      System.out.println(c);
      c = c + 1;
    } while (c <= 0);

  }

}
