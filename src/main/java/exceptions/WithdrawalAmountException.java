package exceptions;

public class WithdrawalAmountException extends Exception {

    Double depositAccount;
    Double funds;

    public WithdrawalAmountException(Double depositAccount, Double funds) {
        super(
                String.format("Only %.2f funds are available for withdrawal", depositAccount)
        );
        this.depositAccount = depositAccount;
        this.funds = funds;
    }
}
