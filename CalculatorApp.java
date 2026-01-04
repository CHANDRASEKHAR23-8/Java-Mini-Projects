import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== CALCULATOR MENU =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {

                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("Result: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Result: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Result: " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("Result: " + (num1 / num2));
                        } else {
                            System.out.println("Cannot divide by zero!");
                        }
                        break;
                }

            } else if (choice == 5) {
                System.out.println("Exiting Calculator...");
            } else {
                System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
