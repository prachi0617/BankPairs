package io.zipcoder;

import java.util.ArrayList;

public abstract class Account {
    private Object accountHolder;
    private Double balance;
    private String accountNumber;
    private ArrayList<String> transactions;
    //array list of transactions
    // TODO: Add a field to track transactions

    public Account(Object accountHolder, Double balance, String accountNumber) {
        // TODO: Implement constructor
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.transactions = new ArrayList<>();
    }

    public Object getAccountHolder() {
        // TODO: Implement getter
        return this.accountHolder;
    }

    public Double getBalance() {
        // TODO: Implement getter
        return this.balance;
    }

    public void setBalance(Double balance) {
        // TODO: Implement setter
        this.balance = balance;
    }

    public String getAccountNumber() {
        // TODO: Implement getter
        return this.accountNumber;
    }

    public void credit(Double amount) {
        // TODO: Implement credit method (add money to account)
        this.balance += amount;
        System.out.println("Amount: " + amount);
        // TODO: Record this transaction
        transactions.add("Deposited " + amount);
    }

    public void debit(Double amount) {
        // TODO: Implement debit method (remove money from account)
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Amount: " + amount);
            System.out.println("Final balance: " + this.balance);
        }
        // TODO: Record this transaction
        transactions.add("Withdrew " + amount);
    }
    
    public Object getTransactions() {
        // TODO: Implement method to return transaction history
        return transactions;
    }
}

