import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input a number: ");
            int number = scanner.nextInt();
            for (int i = 1; i < 11; i++) {
                System.out.println(number + " x " + i +" = "+ (number*i));
            }
        }
    }
}
