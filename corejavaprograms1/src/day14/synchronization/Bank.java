package day14.synchronization;

public interface Bank {
    int MINBAL = 5000;              // implicitly public static final
    int DAILY_LIMIT = 25000;        // implicitly public static final

    void deposit(int amt) throws DepositLimitExceedsException;
    void withdraw(int amt) throws InsufficientBalanceException;
}
