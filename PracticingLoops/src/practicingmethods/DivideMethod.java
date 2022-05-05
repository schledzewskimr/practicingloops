package practicingmethods;
import java.util.Scanner;

public class DivideMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a number");
        Double numberOne = scanner.nextDouble();
        System.out.println("Choose another number");
        Double numberTwo = scanner.nextDouble();

        divide(numberOne, numberTwo);

    }

    public static void divide(double numberOne, double numberTwo){
        System.out.println((int)numberOne + " / " + (int)numberTwo + " = " + numberOne/numberTwo);
    }
    
}
