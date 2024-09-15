import java.util.Scanner;

class Calculator {
    
    public static double add(int a, int b) {
        return a + b;
    }

    public static double sub(int a, int b) {
        return a - b;
    }

    public static double multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return Double.NaN; 
        }
        return (double) a / b;
    }
}

