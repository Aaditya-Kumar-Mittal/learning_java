
import java.util.Scanner;

public class MyTemp4 {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // TAking integer input;

    System.out.print("Enter an integer: ");
    int a = sc.nextInt();
    System.out.println("You entered: " + a);
    // Taking double input;

    System.out.print("Enter a string : ");
    sc.nextLine(); // Consume the newline character
    String str = sc.nextLine();
    System.out.println("You entered: " + str);

    System.out.print("Enter a double: ");
    double b = sc.nextDouble();
    System.out.println("You entered: " + b);

    System.out.println("Enter a character: ");
    char c = sc.next().charAt(0);
    System.out.println("You entered: " + c);

    System.out.println("Enter a float: ");
    float d = sc.nextFloat();
    System.out.println("You entered: " + d);

    System.out.println("Enter a boolean : ");
    boolean e = sc.nextBoolean();
    System.out.println("You entered: " + e);

    sc.close();
  }
}