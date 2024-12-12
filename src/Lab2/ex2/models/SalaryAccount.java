package Lab2.ex2.models;

import Lab2.ex2.enums.AccountType;
import Lab2.ex2.enums.Currency;

public class SalaryAccount extends Account{

    public SalaryAccount(long id,
                         AccountType accountType,
                         Currency currency,
                         double balance) {
        super(id, accountType, currency, balance);
    }

    @Override
    public double calculateInterestValue() {
        if(this.getAccountType() == AccountType.CORPORATE){

            return 0;
        }

        if(this.getCurrency() == Currency.BGN){

            return this.getBalance() * 0.05;
        }

        if(this.getCurrency() == Currency.USD){

            return this.getBalance() * 0.03;
        }

        if(this.getCurrency() == Currency.EUR){

            return this.getBalance() * 0.02;
        }

        return this.getBalance() * 0.01;
    }
}
