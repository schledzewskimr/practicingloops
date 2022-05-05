import java.util.Scanner;
public class CountToEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number less than 11");
            int number = scanner.nextInt();
            if (number > 10) {
                System.out.println("Must be less than 11!");
                continue;
            }
            
            for (int i = number; i < 12; i++) {
                System.out.println(i);
            }
        }
    }
}
