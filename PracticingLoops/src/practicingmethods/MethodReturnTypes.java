package practicingmethods;

public class MethodReturnTypes {
    public static void main(String[] args) {
        String theString = stringMethod();
        int theInt = intMethod();
        boolean theBoolean = booleanMethod();

        System.out.println("String:" + theString);
        System.out.println("Int:" + theInt);
        System.out.println("Boolean:" + theBoolean);

    }

    public static String stringMethod() {
        return "Heres a string!";
    }
    
    public static int intMethod() {
        return 11;
    }

    public static boolean booleanMethod() {
        return true;
    }
}
