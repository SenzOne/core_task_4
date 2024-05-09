package service;

import exceptions.WithdrawalAmountException;
import model.Account;

public class AccountService {

    public Account createAccount(String name) {
        System.out.println("Create account" + name);
        return new Account(0d, 0d, 0d, name);
    }

    public Account createAccount(Double initialAccountBalance, Double depositAccount, Double withdrawalAmount, String number) {
        checkCreateAccountData(initialAccountBalance, depositAccount, withdrawalAmount);
        return new Account(initialAccountBalance, depositAccount, withdrawalAmount, number);
    }

    private void checkCreateAccountData(Double initialAccountBalance, Double depositAccount, Double withdrawalAmount) {
        if (initialAccountBalance < 0 || depositAccount < 0 || withdrawalAmount < 0)
            throw new IllegalArgumentException();
    }

    public void addFundsToTheAccount(Account account, Double funds) {
        checkFunds(funds);
        account.setDepositAccount(account.getDepositAccount() + funds);
        System.out.println(account);
    }

    private void checkFunds(Double funds) {
        if (funds < 0) throw new IllegalArgumentException();
    }

    public void withdrawFundsFromTheAccount(Account account, Double funds) throws WithdrawalAmountException {
        checkFunds(funds);
        if (account.getDepositAccount() < funds)
            throw new WithdrawalAmountException(account.getDepositAccount(), funds);
        account.setDepositAccount(account.getDepositAccount() - funds);

        System.out.println(account);
    }
}
