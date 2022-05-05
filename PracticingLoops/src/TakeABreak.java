import java.util.Scanner;

public class TakeABreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to take a break?");
        while (true) {
            String toBreak = scanner.nextLine();
            if (toBreak.equals("yes")) {
                break;
            }
        
            System.out.println("Would you like to take a break?");
        }
        
        System.out.println("Okay!");
    }
}
