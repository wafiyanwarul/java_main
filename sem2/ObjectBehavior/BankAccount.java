package practicumpbo.objectbehavior;

/**
 * Wafiy Anwarul Hikam / 220605110022? / Praktikum PBO / F
 * @author ACER A515-45-R3RR
 */
public class BankAccount {
    private int accountNumber;
    private String accountName;
    private double balance;
    private Transaction[] transactions;

    public BankAccount(int accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = 0.0;
        this.transactions = new Transaction[10];
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        addTransaction(new Transaction("DEPOSIT", amount));
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
        addTransaction(new Transaction("WITHDRAW", amount));
    }

    private void addTransaction(Transaction transaction) {
        for (int i = transactions.length - 1; i > 0; i--) {
            transactions[i] = transactions[i - 1];
        }
        transactions[0] = transaction;
    }

    public void printTransactions() {
        System.out.println("Transaction history for account " + accountNumber + ":");
        for (int i = 0; i < transactions.length; i++) {
            Transaction transaction = transactions[i];
            if (transaction != null) {
                System.out.println(transaction.toString());
            }
        }
    }
}

class Transaction {
    private String type;
    private double amount;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public String toString() {
        return type + " " + amount;
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(123456, "John Doe");
        account.deposit(500.0);
        account.withdraw(200.0);
        account.deposit(1000.0);
        account.withdraw(700.0);
        account.deposit(300.0);
        account.printTransactions();
    }
}

