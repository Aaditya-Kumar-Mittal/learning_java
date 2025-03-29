public class Main {

  public static int factorial(int num) {

    if (num == 0 || num == 1) {
      return 1;
    }
    return num * factorial(num - 1);
  }

  public static void main(String[] args) {

    System.out.println(factorial(5));
    System.out.println(factorial(13));
  }
}
