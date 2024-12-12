package Lab2.ex2.models;

import Lab2.ex2.enums.AccountType;
import Lab2.ex2.enums.Currency;

public class SavingsAccount extends Account{

    public SavingsAccount(long id,
                          AccountType accountType,
                          Currency currency,
                          double balance) {
        super(id, accountType, currency, balance);
    }

    @Override
    public double calculateInterestValue() {
        if(this.getCurrency() == Currency.BGN &&
                this.getAccountType() == AccountType.PERSONAL){

            return this.getBalance() * 0.15;
        }

        if(this.getCurrency() == Currency.BGN){

            return this.getBalance() * 0.05;
        }

        if(this.getAccountType() == AccountType.PERSONAL &&
                this.getCurrency() == Currency.USD) {

            return this.getBalance() * 0.1;
        }

        return this.getBalance() * 0.01;
    }
}
