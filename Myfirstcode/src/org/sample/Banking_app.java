package org.sample;

import java.util.Scanner;

public class Banking_app {

    public static void main(String[] args) {
        double balance = 1000.00;
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n--- Welcome to BOB Mr.Sonu Kumar---");
            System.out.println("1. Check your Balance");
            System.out.println("2. Deposit your Money");
            System.out.println("3. Withdraw your Money");
            System.out.println("4. Transfer your Money");
            System.out.println("5. Exit to Current Page: Visit Again.");

          
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();


            switch (choice) {
                case 1:
                   
                    System.out.println("Your current balance is: $" + balance);
                    break;

                case 2:

                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println(depositAmount + " deposited successfully. New balance: $" + balance);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case 3:

                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println(withdrawAmount + " withdrawn successfully. New balance: $" + balance);
                    } else {
                        System.out.println("Invalid withdrawal amount or insufficient balance.");
                    }
                    break;

                case 4:

                    System.out.print("Enter recipient account number: ");
                    String recipient = scanner.next();
                    System.out.print("Enter transfer amount: ");
                    double transferAmount = scanner.nextDouble();
                    if (transferAmount > 0 && transferAmount <= balance) {
                        balance -= transferAmount;
                        System.out.println(transferAmount + " transferred successfully to account " + recipient + ". New balance: $" + balance);
                    } else {
                        System.out.println("Invalid transfer amount or insufficient balance.");
                    }
                    break;

                case 5:

                    System.out.println("\nThank you for using BOB bank. welcome to in feature as well Mr. Sonu Kumar.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

/*
 package org.sample;

public class Banking_app {

    public static void main(String[] args) {
        double balance = 1000.00;

        int[] menuChoices = {1, 2, 3, 4, 5};
        double[] depositAmounts = {500.00};
        double[] withdrawAmounts = {400.00};
        double[] transferAmounts = {100.00};
        String[] recipients = {"1234567"};

        int menuIndex = 0;
        int depositIndex = 0;
        int withdrawIndex = 0;
        int transferIndex = 0;

        while (menuIndex < menuChoices.length) {
            System.out.println("\n--- Banking System ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Transfer Money");
            System.out.println("5. Exit");
            
            System.out.println("Enter the choice : ");
            int choice = menuChoices[menuIndex++];

            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: $" + balance);
                    break;

                case 2:
                    if (depositIndex < depositAmounts.length) {
                        double depositAmount = depositAmounts[depositIndex++];
                        if (depositAmount > 0) {
                            balance += depositAmount;
                            System.out.println(depositAmount + " deposited successfully. New balance: $" + balance);
                        } else {
                            System.out.println("Invalid deposit amount.");
                        }
                    } else {
                        System.out.println("No more deposit transactions available.");
                    }
                    break;

                case 3:
                    if (withdrawIndex < withdrawAmounts.length) {
                        double withdrawAmount = withdrawAmounts[withdrawIndex++];
                        if (withdrawAmount > 0 && withdrawAmount <= balance) {
                            balance -= withdrawAmount;
                            System.out.println(withdrawAmount + " withdrawn successfully. New balance: $" + balance);
                        } else {
                            System.out.println("Invalid withdrawal amount or insufficient balance.");
                        }
                    } else {
                        System.out.println("No more withdrawal transactions available.");
                    }
                    break;

                case 4:
                    if (transferIndex < transferAmounts.length) {
                        double transferAmount = transferAmounts[transferIndex];
                        String recipient = recipients[transferIndex];
                        transferIndex++;
                        if (transferAmount > 0 && transferAmount <= balance) {
                            balance -= transferAmount;
                            System.out.println(transferAmount + " transferred successfully to account " + recipient + ". New balance: $" + balance);
                        } else {
                            System.out.println("Invalid transfer amount or insufficient balance.");
                        }
                    } else {
                        System.out.println("No more transfer transactions available.");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using bob");
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

       }
}

 */
