public class Account {
    private double deposits;
    private double withdrawals;

    public Account(double deposits, double withdrawals) {
        this.deposits = deposits;
        this.withdrawals = withdrawals;
    }

    public double getDeposits() {
        return deposits;
    }

    public double getWithdrawals() {
        return withdrawals;
    }
}
