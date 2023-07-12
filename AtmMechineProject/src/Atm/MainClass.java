package Atm;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        AtmOperation op = new AtmOperationsImpl();
        int atmnumber = 12345;
        int atmpin = 123;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine");
        System.out.print("Enter ATM Number: ");
        int atmNumber = sc.nextInt();
        System.out.print("Enter ATM Pin: ");
        int Pin = sc.nextInt();
        if ((atmnumber == atmNumber) && (atmpin == Pin)){
            System.out.println("Validation Done ");
            while (true){
                System.out.println("1. View Available Balance");
                System.out.println("2. Withdraw Amount");
                System.out.println("3. Deposit Amount");
                System.out.println("4. View Ministatement");
                System.out.println("5. Exit");
                System.out.println("Enter Choice");
                int ch = sc.nextInt();
                if (ch == 1){
                    op.viewBalance();

                } else if (ch == 2) {
                    System.out.println("Enter Amount to Withdraw");
                    double withdrawAmount = sc.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                } else if (ch == 3) {
                    System.out.println("Enter Amount To Deposit: ");
                    double depositAmount = sc.nextDouble();
                    op.depositAmount(depositAmount);
                    
                } else if (ch == 4) {
                    op.viewMiniStatement();
                    
                } else if (ch == 5) {
                    System.out.print("Collect your Atm Card\n Thank you for using Atm Machine");
                    System.exit(0);
                }
                else {
                    System.out.print("Please Enter Correct Choice");

                }

            }
        }
        else {
            System.out.print("Incorrect Atm Number or Pin");
            System.exit(0);
        }
    }
}
