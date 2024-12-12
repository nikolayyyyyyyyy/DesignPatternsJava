package Lab2.ex2.models;

import Lab2.ex2.enums.AccountType;
import Lab2.ex2.enums.Currency;

public class DepositAccount extends Account{


    public DepositAccount(long id,
                          AccountType accountType,
                          Currency currency,
                          double balance) {
        super(id, accountType, currency, balance);
    }

    @Override
    public double calculateInterestValue() {
        if(this.getAccountType() == AccountType.PERSONAL){

            return this.getBalance() * 0.09;
        }

        if(this.getCurrency() == Currency.BGN){

            return this.getBalance() * 0.07;
        }

        if(this.getCurrency() == Currency.USD){

            return this.getBalance() * 0.05;
        }

        if(this.getCurrency() == Currency.EUR){

            return this.getBalance() * 0.02;
        }

        return this.getBalance() * 0.01;
    }
}
