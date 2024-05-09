package model;

import java.util.Objects;

public class Account {
    Double initialAccountBalance;
    Double depositAccount;
    Double withdrawalAmount;
    String accountNumber;

    public Account(Double initialAccountBalance, Double depositAccount, Double withdrawalAmount, String accountNumber) {
        this.initialAccountBalance = initialAccountBalance;
        this.depositAccount = depositAccount;
        this.withdrawalAmount = withdrawalAmount;
        this.accountNumber = accountNumber;
    }

    public Account() {
    }

    public Double getInitialAccountBalance() {
        return initialAccountBalance;
    }

    public void setInitialAccountBalance(Double initialAccountBalance) {
        this.initialAccountBalance = initialAccountBalance;
    }

    public Double getDepositAccount() {
        return depositAccount;
    }

    public void setDepositAccount(Double depositAccount) {
        this.depositAccount = depositAccount;
    }

    public Double getWithdrawalAmount() {
        return withdrawalAmount;
    }

    public void setWithdrawalAmount(Double withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(getInitialAccountBalance(), account.getInitialAccountBalance()) && Objects.equals(getDepositAccount(), account.getDepositAccount()) && Objects.equals(getWithdrawalAmount(), account.getWithdrawalAmount());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getInitialAccountBalance(), getDepositAccount(), getWithdrawalAmount());
    }

    @Override
    public String toString() {
        return accountNumber +
               " initialAccountBalance=" + initialAccountBalance +
               ", depositAccount=" + depositAccount +
               ", withdrawalAmount=" + withdrawalAmount +
               '}';
    }
}
