package ExceptionPractice;

import java.util.Scanner;

class BankBalance {

    public static void withdraw(int balance, int amount, int pin) {

        // PIN Validation
        if (pin != 1234) {
            throw new ArithmeticException("Invalid PIN");
        }

        System.out.println("Login Successful");
        System.out.println("Current Balance: " + balance);

        // Amount Validation
        if (amount <= 0) {
            throw new ArithmeticException("Amount should be greater than 0");
        }

        // Balance Validation
        if (amount > balance) {
            throw new ArithmeticException("Insufficient Balance");
        }

        int remainingBalance = balance - amount;

        System.out.println("Withdraw Successful");
        System.out.println("Remaining Balance: " + remainingBalance);
    }
}

public class Bank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        System.out.print("Enter Amount to Withdraw: ");
        int amount = sc.nextInt();

        try {
            BankBalance.withdraw(60000, amount, pin);
        }
        catch (ArithmeticException e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        }

        System.out.println("Thank You For Using ATM");

        sc.close();
    }
}