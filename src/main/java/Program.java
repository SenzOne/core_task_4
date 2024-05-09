
import exceptions.WithdrawalAmountException;
import model.Account;
import service.AccountService;

public class Program {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();

        Account account_001 = accountService.createAccount("001");
        Account account_002 = accountService.createAccount("002");

        try {
            accountService.addFundsToTheAccount(account_001, 10d);
            accountService.withdrawFundsFromTheAccount(account_001, 6d);
            accountService.withdrawFundsFromTheAccount(account_001, 10d);
        } catch (IllegalArgumentException | WithdrawalAmountException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
