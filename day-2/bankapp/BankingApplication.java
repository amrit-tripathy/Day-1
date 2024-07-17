package com.bankapp;

import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        SavingsAccount savingsAccount = new SavingsAccount("SA123", 1000.0, 1234);
        CurrAccount currentAccount = new CurrAccount("CA123", 500.0, 5678, 300.0);

        boolean continueBanking = true;

        while (continueBanking) {
            System.out.println("1. Savings Account");
            System.out.println("2. Current Account");
            System.out.print("Choose account type: ");
            int accountChoice = scanner.nextInt();

            if (accountChoice == 1) {
                System.out.println("1. Withdraw");
                System.out.println("2. Print Account Details");
                System.out.println("3. Change PIN");
                System.out.println("4. Get Balance");
                System.out.print("Choose an action: ");
                int action = scanner.nextInt();

                switch (action) {
                    case 1:
                        System.out.print("Enter amount to withdraw: ");
                        double amount = scanner.nextDouble();
                        savingsAccount.withdraw(amount);
                        break;
                    case 2:
                        savingsAccount.printAccountDetails();
                        break;
                    case 3:
                        System.out.print("Enter new PIN: ");
                        int newPin = scanner.nextInt();
                        savingsAccount.changePin(newPin);
                        break;
                    case 4:
                        System.out.println("Balance: " + savingsAccount.getBalance());
                        break;
                    default:
                        System.out.println("Invalid action.");
                        break;
                }
            } else if (accountChoice == 2) {
                System.out.println("1. Withdraw");
                System.out.println("2. Print Account Details");
                System.out.println("3. Change PIN");
                System.out.println("4. Get Overdraft Limit");
                System.out.print("Choose an action: ");
                int action = scanner.nextInt();

                switch (action) {
                    case 1:
                        System.out.print("Enter amount to withdraw: ");
                        double amount = scanner.nextDouble();
                        currentAccount.withdraw(amount);
                        break;
                    case 2:
                        currentAccount.printAccountDetails();
                        break;
                    case 3:
                        System.out.print("Enter new PIN: ");
                        int newPin = scanner.nextInt();
                        currentAccount.changePin(newPin);
                        break;
                    case 4:
                        System.out.println("Overdraft Limit: " + currentAccount.getOverdraftLimit());
                        break;
                    default:
                        System.out.println("Invalid action.");
                        break;
                }
            } else {
                System.out.println("Invalid account type.");
            }

            System.out.print("Do you want to continue? (yes/no): ");
            String continueResponse = scanner.next();
            if (continueResponse.equalsIgnoreCase("no")) {
                continueBanking = false;
            }
        }

        scanner.close();
        System.out.println("Thank you for using our banking application!");

	}

}
