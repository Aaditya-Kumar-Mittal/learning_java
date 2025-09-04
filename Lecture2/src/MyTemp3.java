
import java.util.Scanner;

public class MyTemp3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Takking input a single word , it will skip any other word if there are spaces, only the first word.
        String word = sc.next();

        System.out.println("You entered: " + word);
    }
}
