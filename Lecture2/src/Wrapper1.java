import java.util.Scanner;

public class Wrapper1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    String intInput = sc.nextLine();
    int intValue = Integer.parseInt(intInput);
    System.out.println("You entered: " + intValue);

    sc.close();
  }
}
