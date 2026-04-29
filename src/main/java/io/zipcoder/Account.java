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
    }

    public Object getAccountHolder() {
        // TODO: Implement getter
        return accountHolder;
    }

    public Double getBalance() {
        // TODO: Implement getter
        return balance;
    }

    public void setBalance(Double balance) {
        // TODO: Implement setter
        this.balance = balance;
    }

    public String getAccountNumber() {
        // TODO: Implement getter
        return accountNumber;
    }

    public void credit(Double amount) {
        // TODO: Implement credit method (add money to account)
        this.amount = amount;
        // TODO: Record this transaction
    }

    public void debit(Double amount) {
        // TODO: Implement debit method (remove money from account)
        // TODO: Record this transaction
    }

    public Object getTransactions() {
        // TODO: Implement method to return transaction history
        return transactions;
    }
}

