package org.example.Bai2;

public class BankAccount {

    public BankAccount(int accountnumber, int balance) {
        this.accountnumber = accountnumber;
        this.balance = balance;
    }

    private int accountnumber;
    private int balance;

    public void deposit(int amount){
        if (amount > 0) balance += amount;
    }
    public void withdraw(int amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
        }
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public int getBalance() {
        return balance;
    }
}
