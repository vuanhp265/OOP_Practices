package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(141, 20000);
        account.deposit(500);
        account.withdraw(2500);
        System.out.println("Account Number: " + account.getAccountnumber());
        System.out.println("Account Balance:" + account.getBalance());
    }
}