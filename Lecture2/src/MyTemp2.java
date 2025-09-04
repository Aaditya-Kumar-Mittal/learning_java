
import java.util.Scanner;

public class MyTemp2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");

        // Allows to take input with spaces or a complete sentence.
        String name = sc.nextLine();

        System.out.println("Hello, " + name + "!");
    }
}
