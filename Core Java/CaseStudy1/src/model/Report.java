package model;

public class Report {

	double totalDeposits;
	double totalWithdrawals;
    int accountsCreated;
    Transaction[] transactions;
    int transactionCount; // number of transactions added

    private static final int MAX_TRANSACTIONS = 100; // maximum transactions in a day

   

   Report()
   {
		this.totalDeposits = 0;
		this.totalWithdrawals = 0;
		this.accountsCreated = 0;
		this.transactions = transactions;
		this.transactionCount = transactionCount;
	}

	
    public void setAccountsCreated(int accountCounter) {
        this.accountsCreated = accountCounter;
    }

    // Increment accounts created by 1
    public void incrementAccountsCreated() {
        this.accountsCreated++;
    }

    // Add a transaction
    public void addTransaction(Transaction t) {
        if (t != null && transactionCount < MAX_TRANSACTIONS) {
            transactions[transactionCount] = t;
            transactionCount++;
        } else if (transactionCount >= MAX_TRANSACTIONS) {
            System.out.println("Transaction limit reached for the day!");
        }
    }

    // Get number of accounts created
    public int getAccountsCreated() {
        return accountsCreated;
    }

    // Generate a simple report
    public void generateReport() {
        System.out.println("Accounts created today: " + accountsCreated);
        System.out.println("Transactions today:");
        for (int i = 0; i < transactionCount; i++) {
            System.out.println(transactions[i]);
        }
    }
}//Report class ends here








