import java.util.ArrayList;
import java.util.List;

public class Account {
    private String accountHolder;
    private int accountNumber;
    private double balance;
    private List<Transaction> transactionHistory;
    public Account(String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
    }
    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add(new Transaction("Deposit", amount));
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add(new Transaction("Withdrawal", amount));
            return true;
        } else {
            System.out.println("Insufficient funds or invalid amount!");
            return false;
        }
    }

    public void printTransactionHistory() {
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions found.");
        } else {
            System.out.println("Transaction History for Account " + accountNumber + ":");
            for (Transaction transaction : transactionHistory) {
                System.out.println(transaction);
            }
        }
    }
    public String toString() {
        return "Account Holder: " + accountHolder + ", Account Number: " + accountNumber + ", Balance: $" + balance;
    }
}