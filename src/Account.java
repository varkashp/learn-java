public class Account {

    private String name;
    private double balance;

    public Account (String name, double balance) {
        this.name = name;
        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    public void deposits (double depositAmount) {
        if (depositAmount > 0.0) {
            balance = balance + depositAmount;
        }
    }

    public void withdraw (double withdrawnAmount) {
        if (withdrawnAmount <= balance) {
            balance = balance - withdrawnAmount;
        }
        if (withdrawnAmount > balance) {
            System.out.println("Withdrawal amount exceeded account balance.");
        }
    }

    public double getBalance () {
        return balance;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

}
