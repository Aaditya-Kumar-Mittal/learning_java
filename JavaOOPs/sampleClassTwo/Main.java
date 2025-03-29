
public class Main {

  public static void main(String[] args) {

    SumMethodClass sumTest1 = new SumMethodClass();

    System.out.println(sumTest1.sum(1, 2));
    System.out.println(sumTest1.sum(1.0f, 2.0f));
    System.out.println(sumTest1.sum(1.0, 2.0));
    System.out.println(sumTest1.sum(1, 2, 3, 4, 5));
    System.out.println(sumTest1.sum(new int[] { 1, 2, 3, 4, 5 }));

  }
}
