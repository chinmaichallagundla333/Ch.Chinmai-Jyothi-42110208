import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<Integer, Account> accounts;
    public Bank() {
        accounts = new HashMap<>();
    }
    public Account createAccount(String accountHolder, int accountNumber) {
        if (!accounts.containsKey(accountNumber)) {
            Account newAccount = new Account(accountHolder, accountNumber);
            accounts.put(accountNumber, newAccount);
            return newAccount;
        } else {
            System.out.println("Account number already exists!");
            return null;
        }
    }
    public Account getAccount(int accountNumber) {
        return accounts.get(accountNumber);
    }
    public void printAllAccounts() {
        for (Account account : accounts.values()) {
            System.out.println(account);
        }
    }
}