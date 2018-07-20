package sample;

/**
 * Created by evohu on 7/20/2018.
 */
public class ATMAccount implements IAccount {

    private String accountHolder;
    private double balance;

    public ATMAccount() {}

    public ATMAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    @Override
    public void deposit(double sum) {
        balance += sum;
    }

    @Override
    public void withdraw(double sum) {
        if (sum <= balance) {
            balance -= sum;
        }
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }
}
