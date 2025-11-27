package model;

import Controller.BankController;
import View.BankView;
import java.time.LocalDate;

public class BankSystemMain {

    public static void main(String[] args) {

        BankModel model = new BankModel();
        BankView view = new BankView();
        BankController c = new BankController(model, view);

        // ===== Sample Accounts =====
        model.addAccount(new SavingsAccount("SAV101", "Rohit Rathod", 20000, LocalDate.of(2025,1,1), null, 0, 0.03));
        model.addAccount(new SalaryAccount("SAL102", "Rahul Deshmukh", 15000, LocalDate.of(2025,2,15), null, 0, LocalDate.of(2025,11,1), false));
        model.addAccount(new CurrentAccount("CUR103", "Radhika Kulkarni", 50000, LocalDate.of(2025,3,10), null, 0, 10000, 0));
        model.addAccount(new LoanAccount("LOA104", "Ankita Patil", 0, LocalDate.of(2025,4,20), null, 0, 100000, 7.5, LocalDate.of(2025,4,20), 24));

        // ===== Menu Loop =====
        boolean run = true;
        while(run) {
            int ch = view.showMenu();
            switch(ch) {
                case 1: c.createAccount(); break;
                case 2: c.deleteAccount(); break;
                case 3: c.depositAmount(); break;
                case 4: c.withdrawAmount(); break;
                case 5: c.searchAccount(); break;
                case 6: c.viewAccountDetails(); break;
                case 7: c.generateEndOfDayReport(); break;
                case 8: c.checkSalaryAccountStatus(); break;
                case 9: c.processInterestCalculation(); break;
                case 10: 
                    Account[] all = model.getAllAccounts();
                    for(Account a : all) {
                        if(a != null)
                            System.out.println(a.getAccountNumber() + " - " + a.getHolderName());
                    }
                    break;
                case 11:
                    String accNo = view.getAccountNumber();
                    Account a = model.getAccountByNumber(accNo);
                    if(a != null)
                        System.out.println("Found: " + a.getAccountNumber() + " - " + a.getHolderName());
                    else
                        System.out.println("Account not found!");
                    break;
                case 12:
                    model.calculateDailyInterest();
                    System.out.println("Interest calculated for all accounts.");
                    break;
                case 13:
                    run = false;
                    System.out.println("Exiting System...");
                    break;
                default:
                    System.out.println("Invalid option! Try again.");
            }
        }
    }
}//BankSystemMain class ends here
