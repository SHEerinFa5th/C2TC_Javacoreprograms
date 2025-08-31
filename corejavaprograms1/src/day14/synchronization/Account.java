package day14.synchronization;

public class Account implements Bank {
    private int accNo;
    private String name;
    private double balance;

    // Getters & Setters
    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Constructors
    public Account() {
        super();
    }

    public Account(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    // To String
    @Override
    public String toString() {
        return "Account [accNo=" + accNo + ", Name=" + name + ", balance=" + balance + "]";
    }

    // Deposit (synchronized)
    @Override
    public synchronized void deposit(int amt) throws DepositLimitExceedsException {
        if (amt > 25000) {
            throw new DepositLimitExceedsException("Daily deposit limit exceeded...");
        } else {
            balance += amt;
            System.out.println("Amount Deposited: Rs." + amt + " | Current Balance: Rs." + balance);
        }
    }

    // Withdraw (synchronized)
    @Override
    public synchronized void withdraw(int amt) throws InsufficientBalanceException {
        if (balance - amt < MINBAL) {
            throw new InsufficientBalanceException("Insufficient balance! Minimum balance of Rs." + MINBAL + " required.");
        } else {
            balance -= amt;
            System.out.println("After withdrawing Rs." + amt + ", Current Balance: Rs." + balance);
        }
    }
}
