package io.zipcoder;

public class CheckingAccount extends Account {
    private boolean overdraftProtection;

    public CheckingAccount(Object accountHolder, Double balance, String accountNumber, boolean overdraftProtection) {
        super(accountHolder, balance, accountNumber);
        // TODO: Implement constructor

        this.overdraftProtection = overdraftProtection;
    }

    public boolean getOverdraftProtection() {
        // TODO: Implement getter
        return overdraftProtection;
    }

    public void setOverdraftProtection(boolean overdraftProtection) {
        // TODO: Implement setter
        this.overdraftProtection = overdraftProtection;
    }

    @Override
    public void debit(Double amount) {
        // TODO: Implement debit method
        if (amount == null || amount <=0) return;
        // If overdraftProtection is true, don't allow balance to go negative
        if (overdraftProtection){
            if(getBalance() >= amount) {
                // If overdraftProtection is false, allow balance to go negative
                super.debit(amount);
            } else {
                super.debit(amount);
            }
        }
        
    }
}
