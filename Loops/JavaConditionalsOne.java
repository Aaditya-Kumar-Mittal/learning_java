public class JavaConditionalsOne {

  public static void main(String[] args) {

    // Avoid using double and float values in switch cases as they are not exact.
    // Instead use if statements.

    int i = 0;

    while (i < 10) {
      System.out.println(i);
      i++;
    }

    for (int j = 1; j <= 10; j++) {
      System.out.printf("%d X %d = %d\n", 7, j, 7 * j);
    }
  }
}