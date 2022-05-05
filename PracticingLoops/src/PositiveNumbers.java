import java.util.Scanner;
public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (number < 0) {
                System.out.println("Numbers must be positive!");
                continue;
            }
            System.out.println("Your number was " + number);
        }
    }
}
