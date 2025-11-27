package View;

import java.util.Scanner;

public class BankView {

    public Scanner sc = new Scanner(System.in);

    public void display(String msg) {
        System.out.println(msg);
    }

    public int showMenu() {
        System.out.println("\n====== BANK MENU ======");
        System.out.println("1. Create Account");
        System.out.println("2. Delete Account");
        System.out.println("3. Deposit");
        System.out.println("4. Withdraw");
        System.out.println("5. Search Account");
        System.out.println("6. View Account Details");
        System.out.println("7. Generate End Of Day Report");
        System.out.println("8. Check Salary Account Status");
        System.out.println("9. Process Interest Calculation");
        System.out.println("10. Get all accounts");
        System.out.println("11. Get Account by number");
        System.out.println("12. Calculate Daily Interest");
        System.out.println("13. Exit");
        System.out.print("Enter your choice: ");
        return sc.nextInt();
    }

    public int showAccountTypeMenu() {
        System.out.println("\nSelect Account Type:");
        System.out.println("1. Savings");
        System.out.println("2. Salary");
        System.out.println("3. Current");
        System.out.println("4. Loan");
        System.out.print("Enter type: ");
        return sc.nextInt();
    }

    public String getAccountNumber() {
        System.out.print("Enter Account Number: ");
        return sc.next();
    }

    public String getHolderName() {
        System.out.print("Enter Holder Name: ");
        return sc.next();
    }

    public double getAmount() {
        System.out.print("Enter Amount: ");
        return sc.nextDouble();
    }

    public double getInterestRate() {
        System.out.print("Enter Interest Rate: ");
        return sc.nextDouble();
    }

    public int getTenure() {
        System.out.print("Enter Tenure (Months): ");
        return sc.nextInt();
    }

    public double getOverdraftLimit() {
        System.out.print("Enter Overdraft Limit: ");
        return sc.nextDouble();
    }
}//BankView class ends here
