# 🏦 Bank Management System (Java OOP + MVC + Arrays)

A complete **console-based Bank Management System** implemented in **Core Java**, using **OOP**, **Arrays**, **Abstract Classes**, and **MVC Architecture**.  
Supports multiple account types, transaction history, interest calculation, overdraft, loan processing, and daily reports.

---

## ⭐ Features

### 🔹 Account Management
- Create Savings, Salary, Current, Loan Accounts  
- Delete account  
- Search account  
- View account details  
- List all accounts  

### 🔹 Banking Operations
- Deposit  
- Withdraw  
- Overdraft support (Current Account)  
- Loan repayment  
- Transaction logging  

### 🔹 System Logic
- Salary Account auto-freeze after 2 months inactivity  
- Minimum balance rules  
- Loan interest calculation  
- Daily Interest processing  
- End-of-Day Report generation  

---

## 🧠 Concepts Used

| Concept | Implementation |
|--------|----------------|
| **Abstract Class** | `Account` |
| **Inheritance** | Savings, Salary, Current, Loan accounts |
| **Polymorphism** | Overridden `calculateInterest()` |
| **Encapsulation** | Private fields + getters |
| **Static Members** | Limits & counters |
| **Arrays** | Store accounts & transactions |
| **MVC Pattern** | `BankModel`, `BankView`, `BankController` |

---

## 📁 Project Structure

/src
│
├── Controller/
│ └── BankController.java
│
├── model/
│ ├── Account.java
│ ├── SavingsAccount.java
│ ├── SalaryAccount.java
│ ├── CurrentAccount.java
│ ├── LoanAccount.java
│ ├── BankModel.java
│ ├── Report.java
│ ├── Transaction.java
│ └── BankSystemMain.java
│
└── View/
└── BankView.java



---

## 🧩 How It Works

### ✔ Account Creation  
Controller selects account type → Model stores in array.

### ✔ Transactions  
Each account stores up to 200 transactions.

### ✔ Interest Logic  
- SavingsAccount → 3%  
- SalaryAccount → Applies if balance ≥ min balance  
- CurrentAccount → No interest  
- LoanAccount → Monthly loan interest added  

### ✔ Salary Account Freeze  
Auto-freezes after 2+ months inactivity and unfreezes on valid deposit.

---

## 📜 Menu (User Interface)

1)Create Account
2)Delete Account
3)Deposit
4)Withdraw
5)Search Account
6)View Account Details
7)Generate End Of Day Report
8)Check Salary Account Status
9)Process Interest Calculation
10)Get All Accounts
11)Get Account By Number
12)Calculate Daily Interest
13)Exit


---

## ▶️ Running the Project

### **Using IDE (Recommended)**
1. Open project in IntelliJ / Eclipse / NetBeans  
2. Run file:  
model/BankSystemMain.java


### **Using Terminal**
javac model/.java Controller/.java View/*.java
java model.BankSystemMain


---

## 🧪 Sample Preloaded Accounts

SAV101 - Savings Account
SAL102 - Salary Account
CUR103 - Current Account
LOA104 - Loan Account


---

## 📊 End-of-Day Report Includes
- Total accounts created  
- Total transactions  
- Deposits / Withdrawals summary  

---

## 🔮 Future Enhancements
- Replace arrays with ArrayList  
- Add file storage  
- Add admin login  
- Build GUI (JavaFX / Swing)  
- Add database support (MySQL)  

---

## 🤝 Contributing
Pull requests and suggestions are welcome.

---

## 📄 License
Licensed under the **MIT License**.
