import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (not 5)");
        while (true) {
            int notFive = scanner.nextInt();
            if (notFive == 5) {
                break;
            }
        
            System.out.println("Good job. Enter another number");
        }
        
        System.out.println("You broke it.");
    }
}
