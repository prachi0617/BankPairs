package io.zipcoder;

public class InvestmentAccount extends Account {
    private Double interestRate;

    public InvestmentAccount(Object accountHolder, Double balance, String accountNumber, Double interestRate) {
        super(accountHolder, balance, accountNumber);
        // TODO: Implement constructor
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        // TODO: Implement getter
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        // TODO: Implement setter
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        // TODO: Implement method to apply interest to the balance
        Double interestAmount = getBalance() * interestRate;
        // New balance = current balance + (current balance * interest rate)
        setBalance(getBalance() + interestAmount);
        // Note: Interest applies even to negative balances
    }

    @Override
    public void debit(Double amount) {
        // TODO: Implement debit method
        setBalance(getBalance() - amount);
        // Investment accounts do NOT have overdraft protection - allow balance to go
        // negative

    }
}
