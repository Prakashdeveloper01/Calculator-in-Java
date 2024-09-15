import java.util.Scanner;

public class Calculator1 extends Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.println();
	System.out.println();
        System.out.println("===== Calculator =======");
        System.out.println();

        int choice;
        do {
            
            System.out.print("Enter the value of A: ");
            int ab = sc.nextInt();

            System.out.print("Enter the value of B: ");
            int ba = sc.nextInt();

            
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");
            choice = sc.nextInt();
            double result;

            
            switch (choice) {
                case 1:
                    result = add(ab, ba);
                    System.out.println("Addition of two numbers: " + result);
                    break;
                case 2:
                    result = sub(ab, ba);
                    System.out.println("Subtraction of two numbers: " + result);
                    break;
                case 3:
                    result = multiply(ab, ba);
                    System.out.println("Multiplication of two numbers: " + result);
                    break;
                case 4:
                    result = divide(ab, ba);
                    if (!Double.isNaN(result)) {
                        System.out.println("Division of two numbers: " + result);
                    }
                    break;
                case 5:
                    System.out.println("Thank You Boss !!!");
                    break;
                default:
                    System.out.println("Invalid Input! Please enter the correct choice.");
                    break;
            }

            
            if (choice != 5) {
                System.out.print("Do you want to continue? Press 1 for Yes, 0 for No: ");
            } else {
                break;
            }
        } while (sc.nextInt() == 1);

        System.out.println("Thank you...");
        sc.close(); 
    }
}
