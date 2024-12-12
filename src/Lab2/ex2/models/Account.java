package Lab2.ex2.models;
import Lab2.ex2.enums.AccountType;
import Lab2.ex2.enums.Currency;
import Lab2.ex2.exceptions.InvalidDataException;
import Lab2.ex2.interfaces.InterestCalculator;

import java.util.Objects;

public abstract class Account implements InterestCalculator {
    private long id;
    private AccountType accountType;
    private Currency currency;
    private double balance;

    public Account(long id, AccountType accountType, Currency currency, double balance) {
        setId(id);
        setAccountType(accountType);
        setCurrency(currency);
        setBalance(balance);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        if(id <= 0){
            throw new InvalidDataException("Id must be positive");
        }

        this.id = id;
    }

    public void setAccountType(AccountType accountType) {
        if(accountType != AccountType.CORPORATE &&
        accountType != AccountType.PERSONAL){

            throw new InvalidDataException("Invalid account type!");
        }
        this.accountType = accountType;
    }

    public void setCurrency(Currency currency) {
        if(currency != Currency.BGN &&
        currency != Currency.GBP &&
        currency != Currency.EUR &&
        currency != Currency.USD){

            throw new InvalidDataException("Invalid currency type!");
        }
        this.currency = currency;
    }

    public void setBalance(double balance) {
        if(balance <= 0){

            throw new InvalidDataException("Balance must be positive");
        }
        this.balance = balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Id: %d AccountType: %s Currency: %s Balance: %f"
                .formatted(this.id,this.accountType,this.currency,this.balance);
    }
}
