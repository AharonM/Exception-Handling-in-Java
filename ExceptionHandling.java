/**
 *  PART III
 */
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        boolean tryAgain = true;
        while (tryAgain) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Please enter 2 numbers: ");
                if (input.hasNextInt()) {
                    int num1 = input.nextInt();
                    if (input.hasNextInt()) {
                        tryAgain = false;
                        int num2 = input.nextInt();
                        int result = num1 + num2;
                        System.out.println("Sum: " + result);
                        input.close();
                        System.exit(0);
                    } else {
                        throw new Exception("Non-Numeric input!");
                    }
                } else {
                    throw new Exception("Non-Numeric input!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
