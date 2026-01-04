import java.util.Scanner;

class ATM {

    private double balance = 10000;
    private int pin = 1234;

    private boolean validatePin(int enteredPin) {
        return enteredPin == pin;
    }

    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful!");
            System.out.println("Remaining Balance: ₹" + balance);
        }
    }

    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount!");
        } else {
            balance += amount;
            System.out.println("Deposit successful!");
            System.out.println("Current Balance: ₹" + balance);
        }
    }

    private void checkBalance() {
        System.out.println("Your Current Balance: ₹" + balance);
    }

    public void startATM() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ATM PIN: ");
        int enteredPin = sc.nextInt();

        if (!validatePin(enteredPin)) {
            System.out.println("Incorrect PIN! Access Denied.");
            return;
        }

        int choice;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Withdraw Money");
            System.out.println("2. Deposit Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ₹");
                    withdraw(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    deposit(sc.nextDouble());
                    break;

                case 3:
                    checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using ATM. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);

        sc.close();
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.startATM();
    }
}

