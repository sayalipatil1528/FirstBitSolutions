package Controller;

import model.*;
import java.time.LocalDate;
import java.util.Date;
import View.BankView;

public class BankController {

    private BankModel model;
    private BankView view;

    public BankController(BankModel model, BankView view) {
        this.model = model;
        this.view = view;
    }

    // ===== Create Account =====
    public void createAccount() {
        int type = view.showAccountTypeMenu();
        String accNo = view.getAccountNumber();
        String holder = view.getHolderName();
        double balance = view.getAmount();

        Account account = null;

        switch(type) {
            case 1: account = new SavingsAccount(accNo, holder, balance, LocalDate.now(), null, 0, view.getInterestRate()); break;
            case 2: account = new SalaryAccount(accNo, holder, balance, LocalDate.now(), null, 0, LocalDate.now(), false); break;
            case 3: account = new CurrentAccount(accNo, holder, balance, LocalDate.now(), null, 0, view.getOverdraftLimit(), 0); break;
            case 4: account = new LoanAccount(accNo, holder, 0, LocalDate.now(), null, 0, balance, view.getInterestRate(), LocalDate.now(), view.getTenure()); break;
            default: view.display("Invalid account type!"); return;
        }

        model.addAccount(account);
        view.display("Account Created Successfully!");
    }

    // ===== Delete Account =====
    public void deleteAccount() {
        String accNo = view.getAccountNumber();
        Account acc = model.getAccountByNumber(accNo);

        if(acc == null) {
            view.display("Account Not Found!");
            return;
        }

        int index = -1;
        for(int i=0; i<model.accountCounter; i++) {
            if(model.getAllAccounts()[i].getAccountNumber().equals(accNo)) {
                index = i;
                break;
            }
        }

        if(index != -1 && model.deleteAccount(index))
            view.display("Account Deleted Successfully!");
        else
            view.display("Failed to delete account!");
    }

    // ===== Deposit =====
    public void depositAmount() {
        String accNo = view.getAccountNumber();
        double amount = view.getAmount();
        Account acc = model.getAccountByNumber(accNo);

        if(acc == null) { view.display("Account Not Found!"); return; }

        Transaction t = new Transaction("T"+new Date().getTime(), new Date(), "Deposit", amount, acc.getBalance()+amount);
        acc.deposit(amount, t);
        view.display("Deposit Successful!");
    }

    // ===== Withdraw =====
    public void withdrawAmount() {
        String accNo = view.getAccountNumber();
        double amount = view.getAmount();
        Account acc = model.getAccountByNumber(accNo);

        if(acc == null) { view.display("Account Not Found!"); return; }

        Transaction t = new Transaction("T"+new Date().getTime(), new Date(), "Withdraw", amount, acc.getBalance()-amount);
        acc.withdraw(amount, t);
        view.display("Withdraw Successful!");
    }

    // ===== Search Account =====
    public void searchAccount() {
        String accNo = view.getAccountNumber();
        Account acc = model.getAccountByNumber(accNo);
        if(acc != null) view.display("Account Found: " + acc.getAccountNumber());
        else view.display("Account Not Found!");
    }

    // ===== View Account Details =====
    public void viewAccountDetails() {
        String accNo = view.getAccountNumber();
        Account acc = model.getAccountByNumber(accNo);
        if(acc != null) view.display(acc.getTransactionDetails());
        else view.display("Account Not Found!");
    }

    // ===== Generate End Of Day Report =====
    public void generateEndOfDayReport() {
        Report report = model.generateEndOfDayReport();
        view.display("End of Day Report Generated!");
        view.display("Accounts Created Today: "+report.getAccountsCreated());
    }

    // ===== Check Salary Account Status =====
    public void checkSalaryAccountStatus() {
        String accNo = view.getAccountNumber();
        Account acc = model.getAccountByNumber(accNo);

        if(acc instanceof SalaryAccount sa)
            sa.checkAccountStatus();
        else
            view.display("Not a Salary Account!");
    }

    // ===== Process Interest Calculation =====
    public void processInterestCalculation() {
        model.calculateDailyInterest();
        view.display("Interest Calculated Successfully!");
    }
}//BankController class ends here
