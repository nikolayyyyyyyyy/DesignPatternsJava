package Lab2.ex2.models;
import Lab2.ex2.enums.Currency;
import java.util.*;

public class Bank {
    private final Map<Account, Double> accounts;

    public Bank() {
        this.accounts = new HashMap<>();
    }

    public void addAccount(Account account) {
        if (!this.accounts.containsKey(account)) {

            this.accounts.put(account, account.calculateInterestValue());
        }
    }

    public void sortAccountByBalance() {
        List<Account> accountsToOrder = new ArrayList<>(this.accounts.keySet());
        this.accounts.clear();

        for (Account account :
                accountsToOrder.stream().sorted(Comparator.comparingDouble(Account::getBalance)).toList()) {
            this.accounts.put(account, account.calculateInterestValue());
        }
    }

    public void sortAccountByInterest() {
        List<Account> accountsToOrder = new ArrayList<>(this.accounts.keySet());
        this.accounts.clear();

        for (Account account :
                accountsToOrder.
                        stream().
                        sorted(Comparator.comparingDouble(Account::calculateInterestValue))
                        .toList()) {
            this.accounts.put(account, account.calculateInterestValue());
        }
    }

    public Currency findCurrencyWithMostAccounts() {
        Map<Currency, Integer> currencies = new HashMap<>();

        for (Account account : this.accounts.keySet()) {
            currencies.put(account.getCurrency(),
                    currencies.getOrDefault(account.getCurrency(), 0) + 1);
        }

        return currencies.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    @Override
    public String toString() {
        return this.accounts.toString();
    }
}